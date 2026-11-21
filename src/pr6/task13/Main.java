package pr6.task13;

public class Main {
    public static void main(String[] args) {
        ObservableStringBuilder text = new ObservableStringBuilder();
        text.addListener(value -> System.out.println("Наблюдатель получил изменение: " + value));
        text.append("Привет").append(", Java");
        text.reverse();
    }
}
