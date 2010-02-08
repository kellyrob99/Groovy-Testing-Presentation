import net.miginfocom.swing.MigLayout
import com.bric.image.transition.spunk.FunkyWipeTransition2D

def script = '''import org.testng.annotations.Test
import static org.testng.Assert.*
import org.unitils.UnitilsTestNG
import org.unitils.inject.annotation.*
import org.unitils.easymock.annotation.*
import org.unitils.easymock.EasyMockUnitils
import static org.easymock.EasyMock.*
@Grab(group='org.unitils', module='unitils-core', version='3.1')
@Grab(group='org.unitils', module='unitils-mock', version='3.1')
@Grab(group='org.unitils', module='unitils-testng', version='3.1')
@Grab(group='org.unitils', module='unitils-inject', version='3.1')
@Grab(group='org.unitils', module='unitils-easymock', version='3.1')
@Grab(group='easymock', module='easymockclassextension', version='2.2')
public class TestNGTest extends UnitilsTestNG
{
    @InjectIntoByType
    String prepend = 'Hello'

    @Mock
    @InjectIntoByType
    private InnerInterface innerInterface

    @TestedObject
    private InnerTestClass innerTestClass = new InnerTestClass()

    @Test
    public void testSimple()
    {
        expect(innerInterface.getPrePend()).andReturn('Hello')
        EasyMockUnitils.replay()
        assertEquals('Hello world', innerTestClass.appendString('world'))
    }

}
public class InnerTestClass
{
        public String prepend
        public InnerInterface innerInterface
        public String appendString(String append)
        {
            return "${innerInterface.getPrePend()} $append"
        }
}
public interface InnerInterface
{
    public String getPrePend()
}
'''

slide(id: "slide5", layout: new MigLayout("fill","3%[center]3%","3%[center]3%"), title: "TestNG with Unitils", transition: new FunkyWipeTransition2D(false)) {
    scrollPane(constraints: "grow") {
        widget(createEditor(text: script))
    }
}
