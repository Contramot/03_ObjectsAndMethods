public class Basket {

    private int count = 0;              // Счетчик товаров внутри каждой корзины
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;

    // Добавьте две статические переменные для хранения общей стоимости и общего количества всех товаров во всех корзинах.
    private static int totalCost;       // Стоимость всех корзин
    private static int totalCount;      // Счетчик товаров для всех корзин

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    // TODO Реализуйте статические методы, которые будут увеличивать значения этих переменных при добавлении в корзину новых товаров.
    // TODO Реализуйте статический метод расчёта средней цены товара во всех корзинах. Он должен рассчитывать и возвращать отношение общей стоимости всех корзин к общему количеству всех товаров.
    // TODO Реализуйте статический метод расчёта средней стоимости корзины (отношение общей стоимости всех корзин к количеству корзин).

    public int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.totalCount = Basket.totalCount + count;
    }

    public void add(String name, int price) {
        add(name, price, 1, 0);
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
            count + " шт. - " + price +
            " руб. - " + weight + " кг.";
        totalPrice = totalPrice + count * price;
        totalWeight += weight;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}
