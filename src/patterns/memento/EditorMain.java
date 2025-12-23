package patterns.memento;

public class EditorMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.saveContent("Sampath 1");
        editor.saveContent("Sampath 2");
        editor.saveContent("Sampath 3");

        System.out.println(editor.getContent());
        editor.undo();
        System.out.println(editor.getContent());
        editor.undo();
        System.out.println(editor.getContent());
        editor.undo();
        System.out.println(editor.getContent());
        editor.undo();
        System.out.println(editor.getContent());
        editor.undo();
        System.out.println(editor.getContent());
    }
}
