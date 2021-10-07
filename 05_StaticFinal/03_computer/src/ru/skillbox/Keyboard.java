package ru.skillbox;

public class Keyboard {
    private final KeyboardType type;
    private final boolean backlight;
    private final int weight;

    public Keyboard(KeyboardType type, boolean backlight, int weight) {
        this.type = type;
        this.backlight = backlight;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Клавиатура:\n" +
                "\tТип клавиатуры: " + type + "\n" +
                "\tПодсветка: " + (backlight ? "Да" : "Нет");
    }
}
