public class Main {
    public static void main(String[] args) {
        // Печать сгенерированного в классе TwoDimensionalArray.java двумерного массива

        char[][] twoDimensionalArray = TwoDimensionalArray.getTwoDimensionalArray(7);
        System.out.println(TwoDimensionalArray.getReport(twoDimensionalArray));

    }
}
