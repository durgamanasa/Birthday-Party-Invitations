import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameTest {
    @Test
    public void test_firstLast_should_return_name_as_first_last() throws Exception {
        Name simran = new Name("Simran", "Pal");
        assertEquals("Simran Pal", simran.firstLast());
    }

    @Test
    public void test_firstLastWith_should_return_name_as_first_last_with_title() throws Exception {
        Name simran = new Name("Simran", "Pal");
        Gender title = Gender.Female;
        assertEquals("Ms Simran Pal", simran.firstLastWith(title));
    }

    @Test
    public void test_lastFirst_should_return_name_as_last_and_first() throws Exception {
        Name bindu = new Name("Bindu", "S");
        assertEquals("S, Bindu", bindu.lastFirst());
    }

    @Test
    public void test_lastFirstWith_should_return_name_as_last_first_with_title() throws Exception {
        Name bindu = new Name("Bindu", "S");
        Gender title = Gender.Female;
        assertEquals("Ms S, Bindu", bindu.lastFirstWith(title));
    }

    @Test
    public void test_firstLastWithCountry_should_return_name_as_first_last_with_title_and_country() throws Exception {
        Name carlos = new Name("Carlos", "Johns");
        Gender title = Gender.Male;
        Country country = new Country("Bangladesh");
        assertEquals("Mr Carlos Johns, Bangladesh", carlos.firstLastWithCountry(title, country));
    }

    @Test
    public void test_firstLastWithCountry_should_return_name_as_first_last_with_country() throws Exception {
        Name brandt = new Name("Brandt", "Huel");
        Country country = new Country("Macedonia");
        assertEquals("Brandt Huel, Macedonia", brandt.firstLastWithCountry(country));
    }

    @Test
    public void test_lastFirstWithCountry_should_return_name_as_last_first_with_title_and_country() throws Exception {
        Name carlos = new Name("Carlos", "Johns");
        Gender title = Gender.Male;
        Country country = new Country("Bangladesh");
        assertEquals("Mr Johns, Carlos, Bangladesh", carlos.lastFirstWithCountry(title, country));
    }

    @Test
    public void test_lastFirstWithCountry_should_return_name_as_last_first_with_country() throws Exception {
        Name brandt = new Name("Brandt", "Huel");
        Country country = new Country("Macedonia");
        assertEquals("Huel, Brandt, Macedonia", brandt.lastFirstWithCountry(country));
    }
}