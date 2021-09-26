public class Arithmetic {

    private static int firstNumber;
    private static int secondNumber;
    private static int sumNumbers = 0;
    private static int multiplicationNumbers = 0;
    private static int maxNumber = 0;
    private static int minNumber = 0;

    public Arithmetic(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public static int calculateSum() {
        sumNumbers = firstNumber + secondNumber;
        return sumNumbers;
    }

    public static int calculateMultiplication() {
        multiplicationNumbers = firstNumber * secondNumber;
        return multiplicationNumbers;
    }

    public static int calculateMaxNumber() {
        if (firstNumber >= secondNumber) {
            maxNumber = firstNumber;
        } else {
            maxNumber = secondNumber;
        }
        return maxNumber;
    }

    public static int calculateMinNumber() {
        if (firstNumber <= secondNumber) {
            minNumber = firstNumber;
        } else {
            minNumber = secondNumber;
        }
        return minNumber;
    }

    public void print() {
        System.out.println("\nАрифметика:");
        System.out.println("Первое число = " + firstNumber);
        System.out.println("Второе число = " + secondNumber);
        System.out.println("Сумма равна = " + calculateSum());
        System.out.println("Произведение равно = " + calculateMultiplication());
        System.out.println("Максимальное число = " + calculateMaxNumber());
        System.out.println("Минимальное число = " + calculateMinNumber());
    }
}
