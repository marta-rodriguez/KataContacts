package rodriguez.marta.katacontacts.presenters;

import rodriguez.marta.katacontacts.entities.Contact;
import rodriguez.marta.katacontacts.usecases.AddContact;
import rodriguez.marta.katacontacts.usecases.GetContacts;
import rodriguez.marta.katacontacts.views.ContactsView;

/**
 * Created by marta on 31/03/16.
 */
public class ContactsPresenter {

    private ContactsView view;
    private AddContact addContact;
    private GetContacts getContacts;

    public ContactsPresenter(ContactsView view, AddContact addContact, GetContacts getContacts) {
        this.view = view;
        this.addContact = addContact;
        this.getContacts = getContacts;
    }

    public void newContact(String name, String phone) {
        addContact.execute(new Contact(name, phone));
    }

    public void needContacts() {
        view.showContacts(getContacts.execute());
    }
}
