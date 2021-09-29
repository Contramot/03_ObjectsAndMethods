package ru.skillbox;

public class Cargo {

    private final Dimensions dimensions;
    private final double weight;
    private final String deliveryAddress;
    private final boolean isPossibleToFlip;
    private final String registrationNumber;
    private final boolean isFragile;

    public Cargo(Dimensions dimensions,
                 double weight,
                 String deliveryAddress,
                 boolean isPossibleToFlip,
                 String registrationNumber,
                 boolean isFragile) {

        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.isPossibleToFlip = isPossibleToFlip;
        this.registrationNumber = registrationNumber;
        this.isFragile = isFragile;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean isPossibleToFlip() {
        return isPossibleToFlip;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, weight, deliveryAddress, isPossibleToFlip, registrationNumber, isFragile);
    }

    public Cargo setWeight(double weight) {
        return new Cargo(dimensions, weight, deliveryAddress, isPossibleToFlip, registrationNumber, isFragile);
    }

    public Cargo setDeliveryAddress(String deliveryAddress) {
        return new Cargo(dimensions, weight, deliveryAddress, isPossibleToFlip, registrationNumber, isFragile);
    }

    public String toString() {
        return registrationNumber + "\n" + deliveryAddress + "\n" + weight + "\n" +
                dimensions + "\n" + isFragile + "\n" + isPossibleToFlip;
    }
}
