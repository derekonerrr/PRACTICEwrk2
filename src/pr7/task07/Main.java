package pr7.task07;

public class Main {
    public static void main(String[] args) {
        Printable[] items = {
                new Book("Война и мир", "Л. Н. Толстой"),
                new Magazine("Хакер"),
                new Magazine("Наука и жизнь"),
                new Book("Отцы и дети", "И. С. Тургенев")
        };
        System.out.println("Только журналы:");
        Magazine.printMagazines(items);
    }
}
