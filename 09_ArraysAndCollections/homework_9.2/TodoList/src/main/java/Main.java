import java.util.Scanner;

public class  Main {

    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList

        String lineSeparator = System.lineSeparator();
        System.out.println("Введите команду:" + lineSeparator +
                "ADD - добавить дело в конец списка или по индексу" + lineSeparator +
                "EDIT - заменить дело с указанным индексом" + lineSeparator +
                "DELETE - удалить дело с указанным индексом" + lineSeparator +
                "LIST - вывести список дел с порядковыми номерами" + lineSeparator);

        TodoList myTodoList = new TodoList();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] fullAction = input.split("\\s+", 2);

            if (input.equals("0")) {
                break;
            }

            switch (fullAction[0]) {
                case "ADD":
                    myTodoList.add(fullAction[1]);
                    break;
                case "EDIT":
                    break;
                case "DELET":
                    break;
                case "LIST":
                    break;
                default:
                    System.out.println("Не верная команда. Повторите ввод.");
            }


        }

//        String regex1 = "^([/\\D]+)\\s([/\\d]+)\\s(.+)";
//        String regex2 = "^([/\\D]+)\\s(.+)";

    }
}
