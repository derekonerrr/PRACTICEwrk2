package pr7.task08;

public class Main {
    public static void main(String[] args) {
        Printable[] items = {
                new Book("Мастер и Маргарита", "М. А. Булгаков"),
                new Magazine("Хакер"),
                new Book("Преступление и наказание", "Ф. М. Достоевский")
        };
        System.out.println("Только книги:");
        Book.printBooks(items);
    }
}
