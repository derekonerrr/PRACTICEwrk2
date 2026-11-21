package pr6.task06;

public class Shop implements Printable {
    private final String name;
    public Shop(String name) { this.name = name; }
    @Override public void print() { System.out.println("Магазин: " + name); }
}
