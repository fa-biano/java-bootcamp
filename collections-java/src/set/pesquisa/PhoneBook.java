package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    private Set<Contact> contactsSet;

    public PhoneBook() {
        this.contactsSet = new HashSet<>();
    }

    public void addContact(String name, int phone) {
        this.contactsSet.add(new Contact(name, phone));
    }

    public void printContacts() {
        System.out.println(this.contactsSet);
    }

    public Set<Contact> searchByName(String name) {
        Set<Contact> contactsByName = new HashSet<>();

        for (Contact contact : this.contactsSet) {
            if (contact.getName().startsWith(name)) {
                contactsByName.add(contact);
            }
        }
        return contactsByName;
    }

    public Contact updateContactPhone(String name, int newPhone) {
        Contact updatedContact = null;
        for (Contact contact : this.contactsSet) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contact.setPhone(newPhone);
                updatedContact = contact;
                break;
            }
        }
        return updatedContact;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Camila", 123456);
        phoneBook.addContact("Camila", 0);
        phoneBook.addContact("Camila Cavalcante", 111111);
        phoneBook.addContact("Camila DIO", 654321);
        phoneBook.addContact("Maria Silva", 111111);

        phoneBook.printContacts();

        System.out.println(phoneBook.searchByName("Camila"));
        System.out.println("Contato Atualizado: " + phoneBook.updateContactPhone("Maria Silva", 222222));
    }
    
}
