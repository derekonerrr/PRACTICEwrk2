package pr7.task05;

public class ProcessStrings implements StringOperations {
    @Override public int countCharacters(String text) { return text.length(); }

    // Позиции в условии нумеруются с 1: 1, 3, 5... (индексы 0, 2, 4...).
    @Override public String oddPositionCharacters(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i += 2) result.append(text.charAt(i));
        return result.toString();
    }

    @Override public String reverse(String text) { return new StringBuilder(text).reverse().toString(); }
}
