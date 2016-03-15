public class Country {

    private String name;

    public Country(String name) {
        this.name = name;
    }

    public String getCountry() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Country)) return false;
        Country country = (Country) obj;
        return name.equals(country.name);
    }
}
