package rodriguez.marta.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marta on 31/03/16.
 */
public class Agenda {

    private ArrayList<Contact> contacts;

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getContacts() {
        return contacts;
    }

}
