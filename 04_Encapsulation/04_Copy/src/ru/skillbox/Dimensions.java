package ru.skillbox;

public class Dimensions {

    private final int width;
    private final int height;
    private final int length;

    private int cargoVolume;

    public Dimensions(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.cargoVolume = 0;
    }

    public Dimensions(int width, int height, int length, int cargoVolume) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.cargoVolume = cargoVolume;
    }

    public Dimensions setCargoVolume() {
        calculationCargoVolume();
        return new Dimensions(width, height, length, cargoVolume);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public void calculationCargoVolume() {
        cargoVolume = width * height * length;
    }

    public int getCargoVolume() {
        return cargoVolume;
    }

    public String toString() {
        return width + " * " + height + " * " + length + "\n" + cargoVolume;
    }
}
