import net.miginfocom.swing.MigLayout
import com.bric.image.transition.spunk.FlurryTransition2D
import com.bric.image.transition.Transition2D
import com.bric.image.transition.spunk.GooTransition2D

def script = '''import org.testng.annotations.Test
public class TestNGTest
{
    @Test
    public void testSimple()
    {
        println "Test"
    }
}'''

slide(id: "slide4", layout: new MigLayout("fill","3%[center]3%","3%[center]3%"), title: "TestNG", transition: new GooTransition2D(Transition2D.CLOCKWISE)) {
    scrollPane(constraints: "grow") {
        widget(createEditor(text: script))
    }
}