public class Main {

    public static void main(String[] args) {
        String line = "Каждый охотник желает знать, где сидит фазан";

        String[] words = line.split(",?\\s+");

        for (String word : words) {
            System.out.println(word);
        }

        ReverseArray array = new ReverseArray();
        array.reverse(words);

        for (String word : words) {
            System.out.println(word);
        }

    }
}
