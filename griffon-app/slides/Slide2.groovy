import net.miginfocom.swing.MigLayout
import com.bric.image.transition.Transition2D
import com.bric.image.transition.spunk.FlurryTransition2D

def script = '''import groovy.util.GroovyTestCase
public class JUnit3Test extends GroovyTestCase
{
    public void testSimple()
    {
        assertEquals "These two strings should end up equals",
             "ABC", "AB" + "C"    
    }
}'''

slide(layout: new MigLayout("fill","3%[center]3%","3%[center]3%"), title: "Junit3", transition: new FlurryTransition2D(Transition2D.OUT)) {
    scrollPane(constraints: "grow") {
        widget(createEditor(text: script))
    }
}
