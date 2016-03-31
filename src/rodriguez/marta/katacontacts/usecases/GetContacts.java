package rodriguez.marta.katacontacts.usecases;

import rodriguez.marta.katacontacts.entities.Agenda;
import rodriguez.marta.katacontacts.entities.Contact;

import java.util.List;

/**
 * Created by marta on 31/03/16.
 */
public class GetContacts {

    private Agenda agenda;

    public GetContacts(Agenda agenda) {
        this.agenda = agenda;
    }

    public List<Contact> execute() {
        return agenda.getContacts();
    }
}
