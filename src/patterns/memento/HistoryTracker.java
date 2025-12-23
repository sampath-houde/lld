package patterns.memento;

import java.util.Stack;

public class HistoryTracker {

    private final Stack<EditorMemento> history;

    public HistoryTracker() {
        history = new Stack<>();
    }

    public void saveState(EditorMemento editorMemento) {
        history.push(editorMemento);
    }

    public EditorMemento undo() {
        if (!history.isEmpty()) {
            history.pop();
        }
        if (history.isEmpty()) {
            return null;
        } else {
            return history.peek();
        }
    }

}
