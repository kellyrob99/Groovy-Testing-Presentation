import net.miginfocom.swing.MigLayout

createFooter = { idx ->
    def footer
    noparent {
        footer = panel(layout: new MigLayout("fill","2%[left]2%[left][][right]2%","[center]")) {
            label('\u00a9 2010', cssClass: 'footer')
            label(icon: imageIcon('/griffon-icon-32x32.png'), cssClass: 'footer')
            label('Kelly Robinson - Groovy Testing Tools and Techniques', cssClass: 'footer')
            label(idx.toString(), cssClass: 'footer')
        }
    }
    footer
}

createEditor = { params ->
    def editorWidget = null
    def defaults = [editable: true, runnable: true]
    String editorId = "editor" + System.currentTimeMillis()
    noparent {
        def (m, v, c) = controller.createMVCGroup([attrs: defaults + params, containerFrame: deckFrame], "CodeEditor", editorId)
        editorWidget = v.editor
    }
    editorWidget
}

bullet = { params ->
    label(icon: imageIcon(params?.noicon ? "/no-icon.png" : "/groovy-icon.png"), cssClass: (params?.css ?: "normal"),
          constraints: "wrap", text: params.text)
}
