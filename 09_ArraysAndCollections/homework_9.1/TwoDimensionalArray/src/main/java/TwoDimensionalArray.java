import java.util.Arrays;

public class TwoDimensionalArray {
    public static char symbol = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        // Метод создаёт двумерный массив char заданного размера.
        // Массив содержит символ symbol по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        char[][] twoDimensionalArrayData = new char[size][size];
        for (int i = 0; i < twoDimensionalArrayData.length; i++) {
            for (int j = 0; j < twoDimensionalArrayData[i].length; j++) {
                if (i == j || i == (twoDimensionalArrayData[i].length - 1 - j)) {
                    twoDimensionalArrayData[i][j] = symbol;
                } else {
                    twoDimensionalArrayData[i][j] = ' ';
                }
            }
        }

        return twoDimensionalArrayData;
    }

    public static String getReport(char[][] twoDimensionalArray) {

        String lineSeparator = System.lineSeparator();
        StringBuilder arrayToString = new StringBuilder();

        for (char[] row : twoDimensionalArray) {
            arrayToString.append(Arrays.toString(row)).append(lineSeparator);
        }

        return arrayToString.toString();
    }

}
