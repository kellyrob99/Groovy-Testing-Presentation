import net.miginfocom.swing.MigLayout
import com.bric.image.transition.spunk.FunkyWipeTransition2D

def script = '''// Google Collections example
import com.google.common.collect.HashBiMap
@Grab(group='com.google.collections', module='google-collections',
      version='1.0')
def getFruit() {
    [grape:'purple', lemon:'yellow', orange:'orange'] as HashBiMap
}

//change this assertion to make it fail with a pretty message
assert fruit.lemon == 'yellow'
assert fruit.inverse().yellow == 'lemon'
'''

slide(id: "slide5", layout: new MigLayout("fill","3%[center]3%","3%[center]3%"), title: "Groovy Grapes Example", transition: new FunkyWipeTransition2D(false)) {
    scrollPane(constraints: "grow") {
        widget(createEditor(text: script))
    }
}
