package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        ArithmeticCalculator example1 = new ArithmeticCalculator(18,12);

        example1.calculate(Operation.ADD);
        System.out.println(example1.getSum());

        example1.calculate(Operation.SUBTRACT);
        System.out.println(example1.getDifference());

        example1.calculate(Operation.MULTIPLY);
        System.out.println(example1.getProduct());
    }
}
