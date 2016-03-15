import java.util.ArrayList;
import java.util.Iterator;

public class GuestsList {
    private final ArrayList<Person> guestsList;

    public GuestsList() {
        this.guestsList = new ArrayList<Person>();
    }

    public void addGuest(Person guest) {
        guestsList.add(guest);
    }

    public Iterator iterator(){
        return guestsList.iterator();
    }

    public int size() {
        return guestsList.size();
    }
}
