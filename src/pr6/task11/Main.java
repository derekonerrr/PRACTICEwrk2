package pr6.task11;

class KelvinConverter implements Convertable {
    public double convert(double celsius) { return celsius + 273.15; }
}
class FahrenheitConverter implements Convertable {
    public double convert(double celsius) { return celsius * 9.0 / 5.0 + 32.0; }
}
public class Main {
    public static void main(String[] args) {
        double celsius = 25.0;
        Convertable[] converters = { new KelvinConverter(), new FahrenheitConverter() };
        System.out.printf("%.2f °C = %.2f K%n", celsius, converters[0].convert(celsius));
        System.out.printf("%.2f °C = %.2f °F%n", celsius, converters[1].convert(celsius));
    }
}
