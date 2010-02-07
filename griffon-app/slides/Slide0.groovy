import net.miginfocom.swing.MigLayout

slide(id: "slide0", layout: new MigLayout("fill", "[center]", "[bottom]5%[top]")) {
    label(icon: imageIcon("/griffon-icon-128x128.png"), constraints: "wrap")
    label("Groovy Testing Tools and Techniques", cssClass: "header")
}