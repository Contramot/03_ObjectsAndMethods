public class Main {

    public static void main(String[] args) {
        String line = "Каждый охотник желает знать, где сидит фазан";

        String[] words = line.split(",?\\s+");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }



    }
}
