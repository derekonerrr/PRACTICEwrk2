package pr6.task10;

public record Memory(int capacityGb, String type) {
    public Memory {
        if (capacityGb <= 0) throw new IllegalArgumentException("Объём памяти должен быть положительным");
    }
    @Override public String toString() { return "RAM " + capacityGb + " ГБ " + type; }
}
