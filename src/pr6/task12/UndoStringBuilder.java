package pr6.task12;

import java.util.ArrayDeque;
import java.util.Deque;

public class UndoStringBuilder {
    private final StringBuilder builder = new StringBuilder();
    private final Deque<String> history = new ArrayDeque<>();

    private void saveState() { history.push(builder.toString()); }
    public UndoStringBuilder append(String value) { saveState(); builder.append(value); return this; }
    public UndoStringBuilder insert(int offset, String value) { saveState(); builder.insert(offset, value); return this; }
    public UndoStringBuilder delete(int start, int end) { saveState(); builder.delete(start, end); return this; }
    public UndoStringBuilder replace(int start, int end, String value) { saveState(); builder.replace(start, end, value); return this; }
    public boolean undo() {
        if (history.isEmpty()) return false;
        builder.setLength(0);
        builder.append(history.pop());
        return true;
    }
    @Override public String toString() { return builder.toString(); }
}
