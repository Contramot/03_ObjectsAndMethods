import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      //напишите ваш код тут, результат вывести в консоль.
      //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО

      System.out.println((checkingStringForValidity(input) ? formattingFullName(input) : "Введенная строка не является ФИО"));
    }
  }

  public static boolean checkingStringForValidity (String fullName) {
    String lettersList = "[А-Яа-яЁё-]+";
    String regex = lettersList + "\\s+" + lettersList + "\\s+" + lettersList;
    return fullName.matches(regex);
  }

  public static String formattingFullName (String fullName) {
    int space1 = fullName.indexOf(' ');
    int space2 = fullName.lastIndexOf(' ');

    String lastName = fullName.substring(0, space1).trim();
    String firstName = fullName.substring(space1, space2).trim();
    String patronymic = fullName.substring(space2).trim();

    String template = "Фамилия: %s\nИмя: %s\nОтчество: %s";
    return String.format(template, lastName, firstName,patronymic);
  }
}