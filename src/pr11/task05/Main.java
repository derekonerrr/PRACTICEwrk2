package pr11.task05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    private static final int SIZE = 30_000;

    private static long measure(String operation, Runnable action) {
        long start = System.nanoTime();
        action.run();
        return System.nanoTime() - start;
    }

    private static void benchmark(String title, List<Integer> list) {
        long add = measure("add", () -> {
            for (int i = 0; i < SIZE; i++) list.add(i);
        });
        long insert = measure("insert", () -> {
            for (int i = 0; i < 1_000; i++) list.add(list.size() / 2, i);
        });
        long search = measure("search", () -> {
            for (int i = 0; i < 1_000; i++) list.contains(SIZE / 2);
        });
        long delete = measure("delete", () -> {
            for (int i = 0; i < 1_000; i++) list.remove(list.size() / 2);
        });

        System.out.println("\n" + title);
        System.out.printf("Добавление в конец: %.3f мс%n", add / 1_000_000.0);
        System.out.printf("Вставка в середину: %.3f мс%n", insert / 1_000_000.0);
        System.out.printf("Поиск contains(): %.3f мс%n", search / 1_000_000.0);
        System.out.printf("Удаление из середины: %.3f мс%n", delete / 1_000_000.0);
    }

    public static void main(String[] args) {
        benchmark("ArrayList", new ArrayList<>());
        benchmark("LinkedList", new LinkedList<>());
        System.out.println("\nВремя зависит от компьютера, JVM и текущей нагрузки.");
    }
}
