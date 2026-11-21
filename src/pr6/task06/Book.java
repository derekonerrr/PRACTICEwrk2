package pr6.task06;

public class Book implements Printable {
    private final String name, author;
    private final int year;
    public Book(String name, String author, int year) {
        this.name = name; this.author = author; this.year = year;
    }
    public String getName() { return name; }
    @Override public void print() {
        System.out.printf("Книга «%s», автор: %s, год издания: %d%n", name, author, year);
    }
}
