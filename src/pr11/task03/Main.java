package pr11.task03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        try (Scanner scanner = new Scanner(System.in)) {
            SimpleDateFormat inputFormat = new SimpleDateFormat("dd.MM.yyyy");
            inputFormat.setLenient(false);
            System.out.print("Введите имя студента: ");
            String name = scanner.nextLine();
            System.out.print("Введите дату рождения (дд.ММ.гггг): ");
            Date birthDate = inputFormat.parse(scanner.nextLine());
            Student student = new Student(name, birthDate);
            System.out.println(student);
            System.out.println("Короткий формат: " + student.getFormattedBirthDate("dd.MM.yy"));
            System.out.println("Средний формат: " + student.getFormattedBirthDate("dd MMM yyyy"));
            System.out.println("Полный формат: " + student.getFormattedBirthDate("EEEE, d MMMM yyyy"));
        }
    }
}
