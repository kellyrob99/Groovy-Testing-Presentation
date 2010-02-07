import net.miginfocom.swing.MigLayout
import com.bric.image.transition.spunk.FlurryTransition2D
import com.bric.image.transition.Transition2D

def script = '''import org.junit.Test
public class JUnit4Test
{
    @Test
    public void testSimple()
    {
        println "Test"
    }
}'''

slide(id: "slide3", layout: new MigLayout("fill","3%[center]3%","3%[center]3%"), title: "JUnit 4", transition: new FlurryTransition2D(Transition2D.IN)) {
    scrollPane(constraints: "grow") {
        widget(createEditor(text: script))
    }
}
