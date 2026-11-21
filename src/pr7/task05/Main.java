package pr7.task05;

public class Main {
    public static void main(String[] args) {
        StringOperations processor = new ProcessStrings();
        String sample = "Интерфейс";
        System.out.println("Исходная строка: " + sample);
        System.out.println("Количество символов: " + processor.countCharacters(sample));
        System.out.println("Символы на позициях 1, 3, 5...: " + processor.oddPositionCharacters(sample));
        System.out.println("Перевёрнутая строка: " + processor.reverse(sample));
    }
}
