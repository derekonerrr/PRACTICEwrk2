package pr7.task07;

public class Book implements Printable {
    private final String name;
    private final String author;
    public Book(String name, String author) { this.name = name; this.author = author; }
    public String getName() { return name; }
    @Override public void print() { System.out.println("Книга: " + name + ", автор: " + author); }
}
