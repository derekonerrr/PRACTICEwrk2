package pr11.task04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите год, месяц и число через пробел: ");
            int year = scanner.nextInt();
            int month = scanner.nextInt(); // месяц вводится от 1 до 12
            int day = scanner.nextInt();
            System.out.print("Введите часы и минуты через пробел: ");
            int hour = scanner.nextInt();
            int minute = scanner.nextInt();

            Calendar calendar = new GregorianCalendar(year, month - 1, day, hour, minute);
            calendar.setLenient(false);
            calendar.getTime(); // проверка корректности даты
            Date date = calendar.getTime();

            SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            System.out.println("Объект Date: " + formatter.format(date));
            System.out.println("Объект Calendar: " + formatter.format(calendar.getTime()));
        } catch (Exception e) {
            System.out.println("Некорректные дата или время. Проверьте введённые значения.");
        }
    }
}
