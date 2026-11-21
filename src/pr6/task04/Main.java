package pr6.task04;

class Phone implements Priceable {
    private final double price;
    Phone(double price) { if (price < 0) throw new IllegalArgumentException(); this.price = price; }
    public double getPrice() { return price; }
}
class Laptop implements Priceable {
    private final double price;
    Laptop(double price) { if (price < 0) throw new IllegalArgumentException(); this.price = price; }
    public double getPrice() { return price; }
}
public class Main {
    public static void main(String[] args) {
        Priceable[] items = { new Phone(299.99), new Laptop(899.00) };
        for (Priceable item : items) System.out.printf("Цена: %.2f%n", item.getPrice());
    }
}
