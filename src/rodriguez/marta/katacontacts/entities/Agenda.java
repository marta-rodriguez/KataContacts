package rodriguez.marta.katacontacts.entities;

import rodriguez.marta.katacontacts.repositories.contacts.ContactsRepository;

import java.util.List;

/**
 * Created by marta on 31/03/16.
 */
public class Agenda {

    private ContactsRepository contactsRepository;

    public Agenda(ContactsRepository contactsRepository) {
        this.contactsRepository = contactsRepository;
    }

    public void addContact(Contact contact) {
        contactsRepository.add(contact);
    }

    public List<Contact> getContacts() {
        return contactsRepository.getAll();
    }

}
