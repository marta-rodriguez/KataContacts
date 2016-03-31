package rodriguez.marta.katacontacts.views;

import rodriguez.marta.katacontacts.entities.Contact;

import java.util.List;

/**
 * Created by marta on 31/03/16.
 */
public interface ContactsView {

    void showContacts(List<Contact> contacts);

    void showWelcomeMessage();

    void showGoodbyeMessage();

    String getNewContactFirstName();

    String getNewContactLastName();

    String getNewContactPhoneNumber();

    void showDefaultError();

    void showEmptyCase();
}
