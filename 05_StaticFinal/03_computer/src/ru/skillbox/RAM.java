package ru.skillbox;

public class RAM {
    private final RAMType ramType;
    private final int volume;
    private final int weight;

    public RAM(RAMType ramType, int volume, int weight) {
        this.ramType = ramType;
        this.volume = volume;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Оперативная память:\n" +
                "\tТип памяти: " + ramType + "\n" +
                "\tОбъём: " + volume + " Гб";
    }
}
