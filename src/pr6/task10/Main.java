package pr6.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();
        System.out.println("Добавление компьютера в магазин.");
        System.out.print("Марка (APPLE, ASUS, HP, LENOVO, DELL, ACER, MSI, OTHER): ");
        Computer.Brand brand;
        try { brand = Computer.Brand.valueOf(scanner.nextLine().trim().toUpperCase()); }
        catch (IllegalArgumentException ex) { brand = Computer.Brand.OTHER; }
        System.out.print("Модель: "); String model = scanner.nextLine();
        System.out.print("Процессор: "); String cpu = scanner.nextLine();
        System.out.print("Частота процессора (ГГц): "); double frequency = Double.parseDouble(scanner.nextLine());
        System.out.print("Количество ядер: "); int cores = Integer.parseInt(scanner.nextLine());
        System.out.print("Объём ОЗУ (ГБ): "); int ram = Integer.parseInt(scanner.nextLine());
        System.out.print("Тип ОЗУ: "); String ramType = scanner.nextLine();
        System.out.print("Диагональ монитора (дюймы): "); double diagonal = Double.parseDouble(scanner.nextLine());
        System.out.print("Разрешение монитора: "); String resolution = scanner.nextLine();

        shop.addComputer(new Computer(brand, model, new Processor(cpu, frequency, cores),
                new Memory(ram, ramType), new Monitor(diagonal, resolution)));
        System.out.println("\nСодержимое магазина:");
        shop.getComputers().forEach(System.out::println);

        System.out.print("\nВведите модель для поиска: ");
        String search = scanner.nextLine();
        System.out.println(shop.findComputer(search).map(Object::toString).orElse("Компьютер не найден"));

        System.out.print("Введите модель для удаления (Enter — пропустить): ");
        String remove = scanner.nextLine();
        if (!remove.isBlank()) System.out.println(shop.removeComputer(remove) ? "Удалено" : "Не найдено");
    }
}
