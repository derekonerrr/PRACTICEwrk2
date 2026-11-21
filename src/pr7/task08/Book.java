package pr7.task08;

public class Book implements Printable {
    private final String name;
    private final String author;
    public Book(String name, String author) { this.name = name; this.author = author; }
    public String getName() { return name; }
    @Override public void print() { System.out.println("Книга: " + name + ", автор: " + author); }

    public static void printBooks(Printable[] printable) {
        for (Printable item : printable)
            if (item instanceof Book book) System.out.println(book.getName());
    }
}
