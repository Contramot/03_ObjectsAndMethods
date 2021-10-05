public class Main {

    public static void main(String[] args) {

        System.out.println(basketStatistics());

        Basket basket = new Basket();
        basket.add("Milk", 4, 3, 1.5);
        basket.print("Milka");

        System.out.println(basketStatistics());

        Basket basket1 = new Basket();
        basket1.add("Bread", 3, 8, 0.6);
        basket1.print("Bread");

        System.out.println(basketStatistics());

        //arithmetic();

        //printer();
    }

    public static void arithmetic() {
        Arithmetic arithmetic = new Arithmetic(3, 7);
        arithmetic.print();
    }

    public static void printer() {
        Printer printer = new Printer();
        printer.append("И жили они долго и счастливо.");
        printer.append(
                "Mr and Mrs Dursley, of number four, Privet Drive," +
                        " were proud to say that they were perfectly normal," +
                        " thank you very much. They were the last people you’d expect" +
                        " to be involved in anything strange or mysterious," +
                        " because they just didn’t hold with such nonsense.",
                "J.K. Rowling Harry Potter and the Philosopher’s Stone");
        printer.append(
                "Я приближался к месту моего назначения. " +
                        "Вокруг меня, прижимаясь к самой дороге, зеленел лес," +
                        " изредка уступая место полянам, поросшим желтой осокою.",
                "Аркадий и Борис Стругацкие. Понедельник начинается в субботу",
                13);

        printer.print();
        printer.print();
    }

    public static String basketStatistics() {
        return "\nСтатистика по корзинам:\n" +
                "Всего корзин: " + Basket.totalBaskets + "\n" +
                "Всего товаров во всех корзинах: " + Basket.totalCount+ "\n" +
                "Стоимость всех корзин: " + Basket.totalCost + "\n" +
                "Средняя цена товара во всех корзинах: " + Basket.calculationAverageTotalPrice() + "\n" +
                "Средня стоимость корзины: " + Basket.calculationAverageBasketPrice() + "\n";
    }
}
