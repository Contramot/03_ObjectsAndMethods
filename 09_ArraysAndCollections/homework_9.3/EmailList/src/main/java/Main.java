import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

    private static final EmailList emailList = new EmailList();

    public static void main(String[] args) {

        String lineSeparator = System.lineSeparator();
        System.out.println(
                "Список email:" + lineSeparator +
                "ADD - ввод адреса с проверкой" + lineSeparator +
                "LIST - вывод списка email");
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("0")) {
                break;
            }

            String[] action = input.split("\\s+",2);

            switch (action[0]) {
                case "ADD":
                    emailList.add(action[1]);
                    break;
                case "LIST":
                    for (String email : emailList.getSortedEmails()) {
                        System.out.println(email);
                    }
                    break;
                default:
                    System.out.println("Неверная команда. Повторите ввод.");
            }
        }
    }

}
