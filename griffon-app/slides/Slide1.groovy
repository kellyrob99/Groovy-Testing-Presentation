import net.miginfocom.swing.MigLayout

slide(id: "slide1", layout: new MigLayout("fill","5%[left]5%",""), title:'Built in Test Support') {
    bullet(text: 'JUnit 3 support to run any class extending TestCase')
    bullet(text: 'JUnit 4 support to run any annotated class')
    bullet(text: 'TestNG support to run any annotated class')
}
