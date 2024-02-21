package dz6;

import java.util.*;

class PhoneBook {
    private Map<String, List<String>> contacts = new HashMap<>();

    public void addContact(String name, String phoneNumber) {
        contacts.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);
    }

    public Map<String, List<String>> getPhoneBook() {
        return contacts;
    }

    public void printPhoneBook() {
        List<Map.Entry<String, List<String>>> sortedEntries = new ArrayList<>(contacts.entrySet());
        sortedEntries.sort((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()));

        for (Map.Entry<String, List<String>> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Alice", "123456");
        phoneBook.addContact("Bob", "789012");
        phoneBook.addContact("Alice", "987654");
        phoneBook.addContact("Владимир", "123654");
        phoneBook.addContact("Ольга", "946924");
        phoneBook.addContact("Светлана", "777654");
        phoneBook.addContact("Ольга", "987333");
        phoneBook.addContact("Ольга", "949333");

        phoneBook.printPhoneBook();
    }
}

