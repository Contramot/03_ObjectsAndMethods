import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    System.out.println(calculateSalarySum(text));
    }

  public static int calculateSalarySum(String text){
    // реализуйте метод
    int salarySum = 0;
    String regex = "[0-9]+";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      int start = matcher.start();
      int end = matcher.end();
      String str = text.substring(start, end);
      int number = Integer.parseInt(str);
      salarySum += number;
    }
    return salarySum;
  }

}
