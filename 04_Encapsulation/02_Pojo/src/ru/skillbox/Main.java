package ru.skillbox;

public class Main {

    public static void main(String[] args) {

        Country country = new Country("Sokovia");

        System.out.println("\nСтрана: " + country.getTitle() +
                "\nСтолица: " + country.getCapitalName() +
                "\nПлощадь, кв.км: " + country.getArea() +
                "\nНаселение, человек: " + country.getPopulationSize() +
                "\nВыход к морю: " + country.isAccessToTheSea());

        country.setCapitalName("Novi Grad");
        country.setPopulationSize(100000);
        country.setArea(543215.84);
        country.setAccessToTheSea(false);

        System.out.println("\nСтрана: " + country.getTitle() +
                "\nСтолица: " + country.getCapitalName() +
                "\nПлощадь, кв.км: " + country.getArea() +
                "\nНаселение, человек: " + country.getPopulationSize() +
                "\nВыход к морю: " + country.isAccessToTheSea());


        Table table345 = new Table("black", true);

        System.out.println(
                "\nЦвет: " + table345.getColor() +
                "\nКомпьютерный стол: " + table345.isComputerDesk() +
                "\nВысота, см.: " + table345.getHeight() +
                "\nШирина, см.: " + table345.getWidth() +
                "\nДлина, см.: " + table345.getLength()
        );

        table345.setHeight(75.5);
        table345.setWidth(120);
        table345.setLength(80.5);

        System.out.println(
                "\nЦвет: " + table345.getColor() +
                "\nКомпьютерный стол: " + table345.isComputerDesk() +
                "\nВысота, см.: " + table345.getHeight() +
                "\nШирина, см.: " + table345.getWidth() +
                "\nДлина, см.: " + table345.getLength()
        );

    }
}
