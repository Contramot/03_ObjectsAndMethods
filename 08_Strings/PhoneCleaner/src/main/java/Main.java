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
      System.out.println(formatPhoneNumber(input));
    }
  }

  public static String formatPhoneNumber (String phone) {
    String result = "Неверный формат номера";

    String regexCleaner = "[^0-9]";
    phone = phone.replaceAll(regexCleaner, "");

    String regexCorrectFormat = "[7][0-9]{10}";
    if (phone.matches(regexCorrectFormat)) {
      result = phone;
    }

    String regexExtraEight = "[8][0-9]{10}";
    if (phone.matches(regexExtraEight)) {
      result = '7' + phone.substring(1);
    }

    String regexNoCode = "[0-9]{10}";
    if (phone.matches(regexNoCode)) {
      result = '7' + phone;
    }

    return result;
  }

}
