package pr7.task04;

public class Main {
    public static void main(String[] args) {
        MathCalculable math = new MathFunc();
        System.out.println("2 в степени 3 = " + math.power(2, 3));
        System.out.println("Модуль числа 3 + 4i = " + math.complexModule(3, 4));
        System.out.println("Длина окружности радиуса 5 = " + new MathFunc().circleLength(5));
    }
}
