import java.util.Scanner;

public class Main {

    private static final PhoneBook phoneBook = new PhoneBook();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВведите номер телефона, имя или команду:");
            String input = scanner.nextLine();

            if (input.equals("0")) {
                break;
            }

            if (input.equals("LIST")) {
                System.out.println(phoneBook.getAllContacts());
                continue;
            }

            if (phoneBook.nameVerification(input)) {

                if (phoneBook.getContactByName(input).isEmpty()) {
                    System.out.println("Такого имени в телефонной книге нет.");
                } else {
                    System.out.println(phoneBook.getContactByName(input));
                    continue;
                }

                System.out.println("Введите номер телефона для абонента \"" + input + "\":");
                String phone = scanner.nextLine();

                if (phoneBook.phoneVerification(phone)) {
                    phoneBook.addContact(phone, input);
                } else {
                    System.out.println("Неверный формат ввода");
                }

            }

            if (phoneBook.phoneVerification(input)) {

                if (phoneBook.getContactByPhone(input).isEmpty()) {
                    System.out.println("Такого номера нет в телефонной книге.");
                } else {
                    System.out.println(phoneBook.getContactByPhone(input));
                    continue;
                }

                System.out.println("Введите имя абонента для номера \"" + input + "\":");
                String name = scanner.nextLine();

                if (phoneBook.nameVerification(name)) {
                    phoneBook.addContact(input, name);
                } else {
                    System.out.println("Неверный формат ввода");
                }

            }

            if (!phoneBook.nameVerification(input) && !phoneBook.phoneVerification(input)) {
                System.out.println("Неверный формат ввода");
            }
       }
    }
}
