package ru.skillbox;

public class Computer {
    private final Processor processor;
    private final RAM ram;
    private final Drive drive;
    private final Monitor monitor;
    private final Keyboard keyboard;

    private final String vendor;
    private final String name;

    public Computer(Processor processor, RAM ram, Drive drive, Monitor monitor, Keyboard keyboard, String vendor, String name) {
        this.processor = processor;
        this.ram = ram;
        this.drive = drive;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public Computer setProcessor(Processor processor) {
        return new Computer(processor, ram , drive, monitor, keyboard, vendor, name);
    }

    public Computer setRam(RAM ram) {
        return new Computer(processor, ram , drive, monitor, keyboard, vendor, name);
    }

    public Computer setDrive(Drive drive) {
        return new Computer(processor, ram , drive, monitor, keyboard, vendor, name);
    }

    public Computer setMonitor(Monitor monitor) {
        return new Computer(processor, ram , drive, monitor, keyboard, vendor, name);
    }

    public Computer setKeyboard(Keyboard keyboard) {
        return new Computer(processor, ram , drive, monitor, keyboard, vendor, name);
    }

    public Processor getProcessor() {
        return processor;
    }

    public RAM getRam() {
        return ram;
    }

    public Drive getDrive() {
        return drive;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    // Метод расчёта общей массы компьютера, возвращающий суммарный вес всех его комплектующих.
    public double calculateComputerTotalWeight() {
        double computerTotalWeight = (getProcessor().getWeight() +
                getRam().getWeight() +
                getDrive().getWeight() +
                getMonitor().getWeight() +
                getKeyboard().getWeight()) / 1000.0;
        return computerTotalWeight;
    }

    // Метод toString, возвращающий в удобочитаемом формате всю информацию о компьютере и его комплектующих.
    public String toString() {
        return "\nКомпьютер: \n" +
                "\tНазвание: " + name + "\n" +
                "\tПроизводитель: " + vendor + "\n" +
                "\tОбщая масса: " + calculateComputerTotalWeight() + " кг\n" +
                getProcessor().toString() + "\n" +
                getRam().toString() + "\n" +
                getDrive().toString() + "\n" +
                getMonitor().toString() + "\n" +
                getKeyboard().toString();
    }
}
