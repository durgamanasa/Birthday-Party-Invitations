import java.util.Iterator;

public class GuestsGenerator {
    private SeparateRecords allRecords;

    public GuestsGenerator(SeparateRecords allRecords) {
        this.allRecords = allRecords;
    }

    public GuestsList generateGuests() {
        GuestsList guestsList = new GuestsList();
        Iterator iterator = allRecords.iterator();
        while (iterator.hasNext()){
            String[] eachRecord = (String[]) iterator.next();
            Name name = new Name(eachRecord[0], eachRecord[1]);
            Gender gender;
            if (eachRecord[2].equals("Female")) {
                gender = Gender.Female;
            } else {
                gender = Gender.Male;
            }
            int ageAsInt = Integer.parseInt(eachRecord[3]);
            Age age = new Age(ageAsInt);
            City city = new City(eachRecord[4]);
            State state = new State(eachRecord[5]);
            Country country = new Country(eachRecord[6]);
            Address address = new Address(city, state, country);
            Person eachPerson = new Person(name, gender, age, address);
            guestsList.addGuest(eachPerson);
        }
        return guestsList;
    }
}