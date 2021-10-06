package ru.skillbox;

public class ArithmeticCalculator {
    private int number1;
    private int number2;

    private int sum;
    private int difference;
    private int product;

    public ArithmeticCalculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getSum() {
        return sum;
    }

    public int getDifference() {
        return difference;
    }

    public int getProduct() {
        return product;
    }

    public void calculate(Operation operation) {
        if(operation == Operation.ADD) {
            sum = number1 + number2;
        } else if(operation == Operation.SUBTRACT) {
            difference = number1 - number2;
        } else if(operation == Operation.MULTIPLY) {
            product = number1 * number2;
        }
    }
}
