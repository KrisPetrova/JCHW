package lesson4.homework4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        ArrayList<String> phonesForLastName = phoneBook.getOrDefault(lastName, new ArrayList<>());
        phonesForLastName.add(phoneNumber);
        phoneBook.put(lastName, phonesForLastName);
    }

    public ArrayList<String> get(String lastName) {
        return phoneBook.get(lastName);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Sorokina", "89053662554");
        phoneBook.add("Boev", "89205664879");
        phoneBook.add("Petrova", "89136985422");
        phoneBook.add("Sorokina", "89183774912");
        phoneBook.add("Gridnev", "89309876114");

        System.out.println(phoneBook.get("Sorokina"));
    }
}