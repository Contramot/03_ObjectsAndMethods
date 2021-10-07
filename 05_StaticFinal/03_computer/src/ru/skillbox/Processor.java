package ru.skillbox;

public class Processor {
    private final int frequency;
    private final int numberOfCores;
    private final ProcessorManufacturer manufacturer;
    private final int weight;

    public Processor(int frequency, int numberOfCores, ProcessorManufacturer manufacturer, int weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Процессор:\n" +
                "\tПроизводитель: " + manufacturer + "\n" +
                "\tЯдер: " + numberOfCores + "\n" +
                "\tЧастота: " + frequency + " МГц";
    }
}
