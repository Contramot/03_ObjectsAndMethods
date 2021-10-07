package ru.skillbox;

public class Monitor {
    private final int diagonal;
    private final MonitorType type;
    private final int weight;

    public Monitor(int diagonal, MonitorType type, int weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Монитор:\n" +
                "\tТип матрицы: " + type + "\n" +
                "\tДиагональ: " + diagonal + "\"";
    }
}
