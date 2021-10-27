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
    String result;
    String regexCleaner = "[^0-9]";
    phone = phone.replaceAll(regexCleaner, "");

    String regexCountAllNumbers = "[78][0-9]{10}";
    String regexCountNumbers = "[0-9]{10}";
    String regexCorrectFormat = "[^7][0-9]{10}";

    if (phone.matches(regexCountAllNumbers)) {
      if (phone.matches(regexCorrectFormat)) {
        result = '7' + phone.substring(1);
      } else {
        result = phone;
      }
    } else if (phone.matches(regexCountNumbers)) {
      result = '7' + phone;
    } else {
      result = "Неверный формат номера";
    }
    return result;
  }

}
