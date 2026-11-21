package pr6.task06;

public class Main {
    public static void main(String[] args) {
        Printable[] items = {
                new Book("Война и мир", "Л. Н. Толстой", 1863),
                new Magazine("Наука и жизнь"),
                new Book("Отцы и дети", "И. С. Тургенев", 1862),
                new Magazine("Хакер")
        };
        for (Printable item : items) item.print();
    }
}
