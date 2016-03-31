package rodriguez.marta.katacontacts.usecases;

import rodriguez.marta.katacontacts.entities.Agenda;
import rodriguez.marta.katacontacts.entities.Contact;

/**
 * Created by marta on 31/03/16.
 */
public class AddContact {

    private Agenda agenda;

    public AddContact(Agenda agenda) {
        this.agenda = agenda;
    }

    public void execute(Contact contact) {
        agenda.addContact(contact);
    }
}
