import net.miginfocom.swing.MigLayout
import com.bric.image.transition.spunk.FlurryTransition2D
import com.bric.image.transition.Transition2D
import com.bric.image.transition.spunk.GooTransition2D

def script = '''import org.testng.annotations.Test
import static org.testng.Assert.*
public class TestNGTest
{
    @Test
    public void testSimple()
    {
        assertEquals('ABC', 'AB' + 'C')
    }
}'''

slide(id: "slide4", layout: new MigLayout("fill","3%[center]3%","3%[center]3%"), title: "TestNG", transition: new GooTransition2D(Transition2D.OUT)) {
    scrollPane(constraints: "grow") {
        widget(createEditor(text: script))
    }
}