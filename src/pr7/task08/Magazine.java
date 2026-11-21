package pr7.task08;

public class Magazine implements Printable {
    private final String name;
    public Magazine(String name) { this.name = name; }
    @Override public void print() { System.out.println("Журнал: " + name); }
}
