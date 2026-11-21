package pr6.task12;

public class Main {
    public static void main(String[] args) {
        UndoStringBuilder text = new UndoStringBuilder();
        text.append("Java").append(" интерфейсы");
        System.out.println(text);
        text.insert(4, " — ");
        System.out.println(text);
        text.undo();
        System.out.println("После undo: " + text);
    }
}
