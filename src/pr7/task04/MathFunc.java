package pr7.task04;

public class MathFunc implements MathCalculable {
    @Override public double power(double number, int degree) { return Math.pow(number, degree); }
    @Override public double complexModule(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }
    public double circleLength(double radius) {
        if (radius < 0) throw new IllegalArgumentException("Радиус не может быть отрицательным");
        return 2 * PI * radius;
    }
}
