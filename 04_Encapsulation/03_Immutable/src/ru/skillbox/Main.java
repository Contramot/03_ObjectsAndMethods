package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        registrationBook();
        settingProductPrice();
    }

    public static void registrationBook() {
        Book book = new Book("Три мушкетера", "Александ Дюма", 640,"978-5-04-118356-1");

        System.out.println(
                "\nНазвание: " + book.getTitle() +
                        "\nАвтор: " + book.getAuthor() +
                        "\nСтраниц: " + book.getPages() +
                        "\nномер ISBN: " + book.getNumberISBN()
        );
    }

    public static void settingProductPrice() {
        Product product = new Product("Шоколад чёрный", "4823015611292");

        product.setPrice(93);

        System.out.println(
                "\nНаименование: " + product.getName() +
                        "\nЦена: " + product.getPrice() +
                        "\nbarcode: " + product.getBarCode()
        );
    }

}
