import java.util.StringJoiner;

public class Main {

  public static void main(String[] args) {
    String text = "Everyone could notice that people often complain and say that it was better before. It may be a little nostalgia;\n" +
            "the old people would like to return in the 50s, forty-years-old people prefer the 70s.";
    System.out.println(splitTextIntoWords(text));

  }

  public static String splitTextIntoWords(String text) {
    // реализуйте метод

    String regex = "[.,;\\-0-9]";
    text = text.replaceAll(regex, " ");

    String[] words = text.split("\\s+");
    StringJoiner joiner = new StringJoiner(System.lineSeparator());

    for (int i = 0; i < words.length; i++) {
      joiner.add(words[i]);
    }

    String result = joiner.toString();
    return result;
  }

}