package pr7.task07;

public class Magazine implements Printable {
    private final String name;
    public Magazine(String name) { this.name = name; }
    public String getName() { return name; }
    @Override public void print() { System.out.println("Журнал: " + name); }

    public static void printMagazines(Printable[] printable) {
        for (Printable item : printable)
            if (item instanceof Magazine magazine) System.out.println(magazine.getName());
    }
}
