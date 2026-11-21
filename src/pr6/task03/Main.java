package pr6.task03;

class Planet implements Nameable {
    private final String name;
    Planet(String name) { this.name = name; }
    public String getName() { return name; }
}
class Animal implements Nameable {
    private final String name;
    Animal(String name) { this.name = name; }
    public String getName() { return name; }
}
public class Main {
    public static void main(String[] args) {
        Nameable[] objects = { new Planet("Земля"), new Animal("Барсик") };
        for (Nameable object : objects) System.out.println(object.getName());
    }
}
