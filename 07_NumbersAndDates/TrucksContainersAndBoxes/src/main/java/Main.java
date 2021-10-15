import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();

        final int BOXES_IN_CONTAINER = 27;
        final int CONTAINERS_IN_TRACK = 12;

        Integer boxesCounter;
        boxesCounter = Integer.parseInt(boxes);

        int containerCounter = 0;
        int tracksCounter = 0;

        for (int i = 0; i < boxesCounter; i++) {
            if (i % BOXES_IN_CONTAINER == 0) {
                if (containerCounter % CONTAINERS_IN_TRACK == 0) {
                    System.out.println("Грузовик: " + ++tracksCounter);
                }
                System.out.println("\tКонтейнер: " + ++containerCounter);
            }
            System.out.println("\t\tЯщик: " + (i + 1));
        }

        System.out.println("Необходимо:");
        System.out.println("грузовиков - " + tracksCounter + " шт.");
        System.out.println("контейнеров - " + containerCounter + " шт.");
    }
}