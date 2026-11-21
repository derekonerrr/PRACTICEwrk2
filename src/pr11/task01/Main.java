package pr11.task01;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        String developer = "Арсамирзаев Мансур Тимурович";
        // Укажите фактические дату и время получения задания.
        String receivedAt = "Укажите дату и время получения задания";
        Date submittedAt = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Разработчик: " + developer);
        System.out.println("Задание получено: " + receivedAt);
        System.out.println("Задание сдано: " + format.format(submittedAt));
    }
}
