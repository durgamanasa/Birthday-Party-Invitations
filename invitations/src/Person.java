public class Person {
    private final Name name;
    private final Gender gender;
    private final Age age;
    private final Address address;

    public Person(Name name, Gender gender, Age age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String getFirstLast() {
        return name.firstLast();
    }

    public String getFirstLastWithTitle() {
        return name.firstLastWith(gender);
    }

    public String getLastFirst() {
        return name.lastFirst();
    }

    public String getLastFirstWithTitle() {
        return name.lastFirstWith(gender);
    }

    public boolean isOfSameCountry(Country country) {
        return address.isSameCountry(country);
    }

    public String getFirstLastWithCountry(Country country) {
        String nameWithTitle = getFirstLastWithTitle();
        return nameWithTitle + ", " + country.getCountry();
    }

    public String getFirstLastWithCountry() {
        return getFirstLastWithTitle();
    }

    public String getLastFirstWithCountry(Country country) {
        String nameWithTitle = getLastFirstWithTitle();
        return nameWithTitle + ", " + country.getCountry();
    }

    public String getLastFirstWithCountry() {
        return getLastFirstWithTitle();
    }

    public boolean isAboveTheAge(int threshold) {
        return age.isAboveAge(threshold);
    }

    public String getFirstLastWithCountryAndAge(Country country, Age thresholdAge) {
        String nameWithCountry = getFirstLastWithCountry(country);
        return nameWithCountry + ", " + age.getAge();
    }

}
