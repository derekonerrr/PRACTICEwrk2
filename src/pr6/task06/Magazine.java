package pr6.task06;

public class Magazine implements Printable {
    private final String name;
    public Magazine(String name) { this.name = name; }
    public String getName() { return name; }
    @Override public void print() { System.out.println("Журнал «" + name + "»"); }
}
