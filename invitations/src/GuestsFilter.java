import java.util.Iterator;

public class GuestsFilter {
    private GuestsList guestsList;

    public GuestsFilter(GuestsList guestsList) {

        this.guestsList = guestsList;
    }

    public GuestsList filterGuestsByCountry(String specificCountry) {
       GuestsList filteredList = new GuestsList();
        Country country = new Country(specificCountry);
        Iterator iterator = guestsList.iterator();
        while (iterator.hasNext()){
            Person person = (Person) iterator.next();
            if (person.isOfSameCountry(country))
                filteredList.addGuest(person);
        }
        return filteredList;
    }


    public GuestsList filterGuestsByCountryAndAge(Country specificCountry, Age thresholdAge) {
        GuestsList filteredList = new GuestsList();
        Country country = new Country(specificCountry.getCountry());
        Iterator iterator = guestsList.iterator();
        while (iterator.hasNext()){
            Person person = (Person) iterator.next();
            if (person.isOfSameCountry(country) && person.isAboveTheAge(thresholdAge.getAge()))
                filteredList.addGuest(person);
        }
        return filteredList;
    }
}
