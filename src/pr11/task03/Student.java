package pr11.task03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private final String name;
    private final Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = new Date(birthDate.getTime());
    }

    public String getFormattedBirthDate(String pattern) {
        return new SimpleDateFormat(pattern).format(birthDate);
    }

    @Override
    public String toString() {
        return "Студент: " + name + ", дата рождения: " + getFormattedBirthDate("dd.MM.yyyy");
    }
}
