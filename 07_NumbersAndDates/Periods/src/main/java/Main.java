import java.time.LocalDate;
import java.time.Period;

public class Main {

  public static void main(String[] args) {

    LocalDate javaBirthdayDate = LocalDate.of(1996, 1, 26);

    System.out.println(getPeriodFromBirthday(javaBirthdayDate));

  }

  private static String getPeriodFromBirthday(LocalDate birthday) {

    LocalDate today = LocalDate.now();
    Period javaAge = Period.between(birthday, today);

    String periodFromBirthday = "";
    periodFromBirthday += javaAge.getYears() + " years, " +
            javaAge.getMonths() + " months, " +
            javaAge.getDays() + " days";

    return periodFromBirthday;
  }

}
