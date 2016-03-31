package rodriguez.marta.katacontacts.repositories.contacts;

import rodriguez.marta.katacontacts.entities.Contact;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marta on 31/03/16.
 */
public class InMemoryContactsRepository implements ContactsRepository {

    private ArrayList<Contact> contacts;

    public InMemoryContactsRepository() {
        contacts = new ArrayList<Contact>();
    }

    @Override
    public void add(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public List<Contact> getAll() {
        return contacts;
    }
}
