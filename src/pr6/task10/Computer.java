package pr6.task10;

public class Computer {
    public enum Brand { APPLE, ASUS, HP, LENOVO, DELL, ACER, MSI, OTHER }

    private final Brand brand;
    private final Processor processor;
    private final Memory memory;
    private final Monitor monitor;
    private final String model;

    public Computer(Brand brand, String model, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand; this.model = model;
        this.processor = processor; this.memory = memory; this.monitor = monitor;
    }
    public Brand getBrand() { return brand; }
    public String getModel() { return model; }
    @Override public String toString() {
        return brand + " " + model + " | " + processor + " | " + memory + " | " + monitor;
    }
}
