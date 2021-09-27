package ru.skillbox;

public class Table {

    private String color;
    private boolean isComputerDesk;
    private double width;
    private double length;
    private double height;

    public Table(String color, boolean isComputerDesk) {
        this.color = color;
        this.isComputerDesk = isComputerDesk;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isComputerDesk() {
        return isComputerDesk;
    }

    public void setComputerDesk(boolean computerDesk) {
        isComputerDesk = computerDesk;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
