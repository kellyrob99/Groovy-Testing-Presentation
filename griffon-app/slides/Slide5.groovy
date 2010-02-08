import net.miginfocom.swing.MigLayout
import com.bric.image.transition.spunk.FunkyWipeTransition2D

def script = '''import org.testng.annotations.Test
import static org.testng.Assert.*
public class TestNGTest
{
    @Test
    public void testSimple()
    {
        println "Test"
        assertEquals('ABC', 'AB' + 'C')
    }
}'''

slide(id: "slide5", layout: new MigLayout("fill","3%[center]3%","3%[center]3%"), title: "TestNG with Unitils", transition: new FunkyWipeTransition2D(false)) {
    scrollPane(constraints: "grow") {
        widget(createEditor(text: script))
    }
}
