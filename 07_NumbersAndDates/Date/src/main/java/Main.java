import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));
        System.out.println("Hello World");

    }

    public static String collectBirthdays(int year, int month, int day) {

        String collectBirthdays = "";
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - E").localizedBy(new Locale("us"));

        int i = 0;
        while (true) {
            if (birthday.isBefore(today) || birthday.equals(today)) {
                collectBirthdays += i + " - " + formatter.format(birthday) + System.lineSeparator();
                birthday = birthday.plusYears(1);
                i++;
            } else {
                break;
            }
        }

        return collectBirthdays;
    }
}
