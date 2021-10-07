package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Processor processor1 = new Processor(2800, 6, ProcessorManufacturer.Intel, 50);
        RAM ram1 = new RAM(RAMType.DDR4, 16, 100);
        Drive drive1 = new Drive(DriveType.SSD, 512, 150);
        Monitor monitor1 = new Monitor(24, MonitorType.IPS, 1350);
        Keyboard keyboard1 = new Keyboard(KeyboardType.Butterfly, false, 350);

        Computer computer1 = new Computer(processor1, ram1, drive1, monitor1, keyboard1, "R&C", "For_Office");
        System.out.println(computer1.toString());

        Processor processor2 = new Processor(2600,4,ProcessorManufacturer.AMD,45);
        Keyboard keyboard2 = new Keyboard(KeyboardType.Membrane, true, 340);

        Computer computer2 = computer1.setProcessor(processor2);
        computer2 = computer2.setKeyboard(keyboard2);
        System.out.println(computer2.toString());
    }
}
