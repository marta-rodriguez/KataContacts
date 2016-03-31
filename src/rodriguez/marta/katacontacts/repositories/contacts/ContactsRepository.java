package rodriguez.marta.katacontacts.repositories.contacts;

import rodriguez.marta.katacontacts.entities.Contact;

import java.util.List;

/**
 * Created by marta on 31/03/16.
 */
public interface ContactsRepository {
    void add(Contact contact);
    List<Contact> getAll();
}
