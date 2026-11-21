package pr6.task10;

public record Processor(String name, double frequencyGHz, int cores) {
    public Processor {
        if (frequencyGHz <= 0 || cores <= 0) throw new IllegalArgumentException("Некорректные характеристики процессора");
    }
    @Override public String toString() { return "CPU " + name + ", " + frequencyGHz + " ГГц, ядер: " + cores; }
}
