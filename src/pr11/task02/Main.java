package pr11.task02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        format.setLenient(false);
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите дату и время (дд.ММ.гггг ЧЧ:мм): ");
            Date entered = format.parse(scanner.nextLine().trim());
            Date now = new Date();
            int comparison = entered.compareTo(now);
            System.out.println("Текущее время: " + format.format(now));
            if (comparison < 0) System.out.println("Введённая дата находится в прошлом.");
            else if (comparison > 0) System.out.println("Введённая дата находится в будущем.");
            else System.out.println("Даты и время совпадают.");
        } catch (ParseException e) {
            System.out.println("Ошибка формата. Пример: 17.11.2026 14:30");
        }
    }
}
