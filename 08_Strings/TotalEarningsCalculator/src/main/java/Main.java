public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

    System.out.println(calculationTotalIncome(text));
  }

  public static int calculationTotalIncome (String text) {
    int totalIncome = 0;
    int start = 0, stop = 0;

    for (int i = 0; i < text.length(); i++) {
      char symbol = text.charAt(i);
      if (symbol >= '0' && symbol <= '9') {
        start = i;

        for (int j = ++i; j < text.length(); j++) {
          symbol = text.charAt(j);
          if (symbol >= '0' && symbol <= '9') {
            stop = j;
          } else {
            String encodingSum = text.substring(start, stop + 1);
            int sum = Integer.parseInt(encodingSum);
            totalIncome += sum;
            i = ++j;
            break;
          }
        }

      }
    }

    return totalIncome;
  }
}