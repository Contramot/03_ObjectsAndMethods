import java.util.*;

public class PhoneBook {

    Map<String, String> phoneBook = new TreeMap<>();

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона (отдельные методы для проверки)
        // если такой номер уже есть в списке, то перезаписать имя абонента

        if (!nameVerification(name) || !phoneVerification(phone)) {
            System.out.println("Неверный формат ввода");
        } else {
            phoneBook.put(phone, name);
            System.out.println("Контакт сохранён!");
        }

    }

    public String getContactByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку

        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getKey().contains(phone)) {
                return entry.getValue() + " - " + entry.getKey();
            }
        }

        return "";
    }

    public Set<String> getContactByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet

        TreeSet<String> contactByName = new TreeSet<>();

        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().contains(name)) {
                    String contact = entry.getValue() + " - " + getPhonesByName(entry.getValue());
                    contactByName.add(contact);
            }
        }

        return contactByName;
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet

        TreeSet<String> allContacts = new TreeSet<>();

        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            String contact = entry.getValue() + " - " + getPhonesByName(entry.getValue());
            allContacts.add(contact);
        }

        return allContacts;
    }

    public String getPhonesByName(String name) {

        StringJoiner phonesByName = new StringJoiner(", ");

        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().contains(name)) {
                phonesByName.add(entry.getKey());
            }
        }

        return phonesByName.toString();
    }

    public boolean nameVerification(String name) {

        String regexName = "^[A-ZА-ЯЁ][a-zа-яё]*";

        return name.matches(regexName);
    }

    public boolean phoneVerification(String phone) {

        String regexPhone = "[7][0-9]{10}";

        return phone.matches(regexPhone);
    }

    // для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
    // это поможет вам найти все ключи (key) по значению (value)
    /*
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения значения
        }
    */

}
