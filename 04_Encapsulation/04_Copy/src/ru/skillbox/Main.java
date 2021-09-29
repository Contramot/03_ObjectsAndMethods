package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        // Создаём первые габариты
        Dimensions dimensions1 = new Dimensions(10, 20, 30);
        // Для первых габаритов рассчитываем объём
        dimensions1.setCargoVolume();

        // Создаём первый груз, которому присваиваем первые габариты
        Cargo cargo1 = new Cargo(dimensions1, 500, "Lenin str, 15", true,
                "155-ASD-257", false);

        System.out.println(cargo1);
        System.out.println();

        // Создаём второй груз как копию первого, но с новой массой
        Cargo cargo2 = new Cargo(
                cargo1.getDimensions(),
                499,
                cargo1.getDeliveryAddress(),
                cargo1.isPossibleToFlip(),
                cargo1.getRegistrationNumber(),
                cargo1.isFragile()
        );

        System.out.println(cargo2);
        System.out.println();

        // Создаём вторые габариты как копию первых, но с изменённой шириной
        Dimensions dimensions2 = new Dimensions(20, 30, 20);
        // Для вторых габаритов пересчитываем объём
        dimensions2.setCargoVolume();

        // Создаём третий груз как копию второго, но со вторыми габаритами
        Cargo cargo3 = new Cargo(
                dimensions2,
                cargo2.getWeight(),
                cargo2.getDeliveryAddress(),
                cargo2.isPossibleToFlip(),
                cargo2.getRegistrationNumber(),
                cargo2.isFragile()
        );

        System.out.println(cargo3);
        System.out.println();

        // Создаём четвёртый груз как копию третьего, но с новым адресом доставки
        Cargo cargo4 = new Cargo(
                cargo3.getDimensions(),
                cargo3.getWeight(),
                "Gorky str, 51",
                cargo3.isPossibleToFlip(),
                cargo3.getRegistrationNumber(),
                cargo3.isFragile()
        );

        System.out.println(cargo4);
    }
}
