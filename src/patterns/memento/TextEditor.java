package patterns.memento;


public class TextEditor {

    private String content = "";
    private HistoryTracker historyTracker = new HistoryTracker();

    public void saveContent(String newContent) {
        // save state
        historyTracker.saveState(new EditorMemento(newContent));
        content = newContent;
    }

    public String getContent() {
        return content;
    }

    public void undo() {
        EditorMemento previousState = historyTracker.undo();
        if (previousState != null) {
            content = previousState.getContent();
        }
    }



}
