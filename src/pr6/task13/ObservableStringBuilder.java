package pr6.task13;

import java.util.ArrayList;
import java.util.List;

public class ObservableStringBuilder {
    private final StringBuilder builder = new StringBuilder();
    private final List<ChangeListener> listeners = new ArrayList<>();

    public void addListener(ChangeListener listener) { listeners.add(listener); }
    public void removeListener(ChangeListener listener) { listeners.remove(listener); }
    private void notifyListeners() {
        String value = builder.toString();
        for (ChangeListener listener : List.copyOf(listeners)) listener.onChange(value);
    }
    public ObservableStringBuilder append(String text) { builder.append(text); notifyListeners(); return this; }
    public ObservableStringBuilder insert(int offset, String text) { builder.insert(offset, text); notifyListeners(); return this; }
    public ObservableStringBuilder delete(int start, int end) { builder.delete(start, end); notifyListeners(); return this; }
    public ObservableStringBuilder reverse() { builder.reverse(); notifyListeners(); return this; }
    @Override public String toString() { return builder.toString(); }
}
