package map.operacoes_basicas;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private Map<String, Integer> contactsMap;

    public Phonebook() {
        this.contactsMap = new HashMap<>();
    }

    public void addContact(String name, Integer phone) {
        this.contactsMap.put(name, phone);
    }

    public void removeContact(String name) {
        if (this.contactsMap.containsKey(name)) {
            this.contactsMap.remove(name);
        }
    }

    public void printContacts() {
        System.out.println(this.contactsMap);
    }

    public Integer searchByName(String name) {
        Integer phone = null;
        if (this.contactsMap.containsKey(name)) {
            phone = this.contactsMap.get(name);
        }

        return phone;
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.addContact("Camila", 123456);
        phonebook.addContact("Camila", 5665);
        phonebook.addContact("Camila Cavalcante", 111111);
        phonebook.addContact("Camila Dio", 6788990);
        phonebook.addContact("Maria Silva", 111111);
        phonebook.addContact("Camila", 44444);

        phonebook.printContacts();
        phonebook.removeContact("Maria Silva");
        phonebook.printContacts();

        System.out.println(phonebook.searchByName("Camila Dio"));
    }
}
