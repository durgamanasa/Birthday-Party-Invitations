import java.util.Iterator;

public class InviteGuests {
    private GuestsList guestsList;

    public InviteGuests(GuestsList guestsList) {
        this.guestsList = guestsList;
    }

    public void printSpecificFormat(String[] userArgs) {
        ArgumentsSeparator argsSeparator = new ArgumentsSeparator(userArgs);
        String option = argsSeparator.separateOption();
        Country country = new Country(argsSeparator.separateCountry());
        Age age = new Age(argsSeparator.separateAge());
        GuestsFilter guestsFilter = new GuestsFilter(guestsList);
        GuestsList filteredListByCountry = guestsFilter.filterGuestsByCountry(argsSeparator.separateCountry());
        GuestsList filteredListByCountryAndAge = guestsFilter.filterGuestsByCountryAndAge(country, age);
        if (option.equals("--firstLastWithCountry")) {
            guestsList = filteredListByCountry;
        } else {
            if (option.equals("--firstLastWithCountryAndAge"))
                guestsList = filteredListByCountryAndAge;
        }
        Iterator iterator = guestsList.iterator();
        while (iterator.hasNext()) {
            Person eachPerson = (Person) iterator.next();
            switch (option) {
                case "--firstLast":
                    System.out.println(eachPerson.getFirstLast());
                    break;
                case "--firstLastWithTitle":
                    System.out.println("==================");
                    System.out.println(eachPerson.getFirstLastWithTitle());
                    break;
                case "--lastFirst":
                    System.out.println(eachPerson.getLastFirst());
                    break;
                case "--lastFirstWithTitle":
                    System.out.println(eachPerson.getLastFirstWithTitle());
                    break;
                case "--firstLastWithCountry":
                    System.out.println(eachPerson.getFirstLastWithCountry(country));
                    break;
                case "--lastFirstWithCountry":
                    System.out.println(eachPerson.getLastFirstWithCountry(country));
                    break;
                case "--firstLastWithCountryAndAge":
                    System.out.println(eachPerson.getFirstLastWithCountryAndAge(country, age));
                    break;
                default:
                    System.out.println(eachPerson.getFirstLastWithTitle());
            }
        }
    }
}
