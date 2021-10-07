package ru.skillbox;

public class Drive {
    private final DriveType driveType;
    private final int volume;
    private final int weight;

    public Drive(DriveType driveType, int volume, int weight) {
        this.driveType = driveType;
        this.volume = volume;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Накопитель:\n" +
                "\tТип накопителя: " + driveType + "\n" +
                "\tОбъём: " + volume + " Гб";
    }
}
