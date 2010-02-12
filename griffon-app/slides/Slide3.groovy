import net.miginfocom.swing.MigLayout
import com.bric.image.transition.spunk.FlurryTransition2D
import com.bric.image.transition.Transition2D

def script = '''import org.junit.Test
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@Grab(group='junit', module='junit', version='4.7')
@Grab(group='org.hamcrest', module='hamcrest-all', version='1.1')
public class JUnit4Test
{
    @Test
    public void testSimple()
    {
       assertThat("ABC", equalTo("AB" + "C"))   
    }
}'''

slide(id: "slide3", layout: new MigLayout("fill","3%[center]3%","3%[center]3%"), title: "JUnit 4", transition: new FlurryTransition2D(Transition2D.IN)) {
    scrollPane(constraints: "grow") {
        widget(createEditor(text: script))
    }
}
