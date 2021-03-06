import groovy.ui.SystemOutputInterceptor

/**
 * @author Kelly Robinson
 */
public class SlideCodeTest extends GroovyTestCase
{
    public void testScripts()
    {
        //matches slide names
        def p = ~/Slide\d*\.groovy/

        new File('griffon-app/slides').eachFileMatch(p) {File slideFile ->
            def found = false
            //load all lines matching
            def lines = []
            slideFile.text.eachLine {line ->
                def matcher = line =~ /def.*script.*=.*'''.*/
                if (matcher.matches() || found)
                {
                    found = true
                    lines << line
                }
                def matcherEnd = line =~ /.*'''$/
                if (matcherEnd.matches())
                {
                    found = false
                }
            }
            if (lines)
            {
                def scriptText = lines.join('::')
                def matcher = scriptText =~ /(?m).*'''(.*)'''.*/
                if (matcher.matches())
                {
                    println "Testing: ${slideFile.name}"
                    scriptText = matcher[0][1].replaceAll('::', '\n')
                    def buf = new ByteArrayOutputStream()
                    def newOut = new PrintStream(buf)
                    def saveOut = System.out
                    System.out = newOut
                    def result = new GroovyShell().run(scriptText, slideFile.name, [])
                    System.out = saveOut
                    def consoleOutput = buf.toString()
                    assertFalse('No error should be shown',consoleOutput.contains('Error'))
                    if(consoleOutput =~ /.*Failures: [^0]/)
                    {
                       fail("Detected a Failures: >0 in ${slideFile.name} : $consoleOutput")
                    }
                }
            }

        }
    }


}
