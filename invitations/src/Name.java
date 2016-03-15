public class Name {
    private final String first;
    private final String last;

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String firstLast() {
        return this.first + " " + this.last;
    }

    public String firstLastWith(Gender title) {
        return title.getPrefix() + " " + firstLast();
    }

    public String lastFirst() {
        return this.last + ", " + this.first;
    }

    public String lastFirstWith(Gender title) {
        return title.getPrefix() + " " + lastFirst();
    }

    public String firstLastWithCountry(Country country) {
        return firstLast() + ", " + country.getCountry();
    }

    public String firstLastWithCountry(Gender title,Country country) {
        return firstLastWith(title) + ", " + country.getCountry();
    }

    public String lastFirstWithCountry(Country country) {
        return lastFirst() + ", " + country.getCountry();
    }
    public String lastFirstWithCountry(Gender title,Country country) {
        return lastFirstWith(title) + ", " + country.getCountry();
    }
}