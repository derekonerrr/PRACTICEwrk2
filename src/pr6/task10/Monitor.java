package pr6.task10;

public record Monitor(double diagonalInches, String resolution) {
    public Monitor {
        if (diagonalInches <= 0) throw new IllegalArgumentException("Диагональ должна быть положительной");
    }
    @Override public String toString() { return "Монитор " + diagonalInches + " дюймов, " + resolution; }
}
