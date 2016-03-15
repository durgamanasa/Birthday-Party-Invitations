import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PersonTest {
    Name name = new Name("Sage", "Roob");
    Address address = new Address(new City("Crooks ton"), new State("South Carolina"), new Country("Qatar"));
    Age age = new Age(31);
    Person sage = new Person(name, Gender.Female, age, address);

    @Test
    public void test_getFirstLast_should_return_the_name_as_first_and_last() throws Exception {
        assertEquals("Sage Roob", sage.getFirstLast());
    }

    @Test
    public void test_getFirstLastWithTitle_should_return_the_name_as_first_and_last_with_title() throws Exception {
        assertEquals("Ms Sage Roob", sage.getFirstLastWithTitle());
    }

    @Test
    public void test_getLastFirst_should_return_the_name_as_last_and_first() throws Exception {
        assertEquals("Roob, Sage", sage.getLastFirst());
    }

    @Test
    public void test_getLastFirstWithTitle_should_return_the_name_as_last_and_first_with_title() throws Exception {
        assertEquals("Ms Roob, Sage", sage.getLastFirstWithTitle());
    }

    @Test
    public void test_isOfSameCountry_should_return_true_if_the_country_is_same_as_given_country() throws Exception {
        assertTrue(sage.isOfSameCountry(new Country("Qatar")));

    }

    @Test
    public void test_isOfSameCountry_should_return_false_if_the_country_is_not_same_as_given_country() throws Exception {
        assertFalse(sage.isOfSameCountry(new Country("Macedonia")));

    }

    @Test
    public void test_getFirstLastWithCountry_should_return_the_name_as_first_last_with_country_if_there_is_specific_country() throws Exception {
        String actual = sage.getFirstLastWithCountry(new Country("Qatar"));
        String expected = "Ms Sage Roob, Qatar";
        assertEquals(expected, actual);
    }

    @Test
    public void test_getFirstLastWithCountry_should_return_full_name_with_title_if_there_is_no_specific_country() throws Exception {
        assertEquals("Ms Sage Roob", sage.getFirstLastWithCountry());
    }

    @Test
    public void test_getLastFirstWithCountry_should_return_full_name_with_country_if_there_is_specific_country() throws Exception {
        String actual = sage.getLastFirstWithCountry(new Country("Qatar"));
        String expected = "Ms Roob, Sage, Qatar";
        assertEquals(expected, actual);
    }

    @Test
    public void test_getLastFirstWithCountry_should_return_full_name_with_title_if_there_is_no_specific_country() throws Exception {
        String actual = sage.getLastFirstWithCountry();
        String expected = "Ms Roob, Sage";
        assertEquals(expected, actual);
    }

    @Test
    public void test_getFirstLastWithCountryAndAge_should_return_full_name_with_country_and_age() throws Exception {
        Country country = new Country("Qatar");
        Age thresholdAge = new Age(30);
        String actual = sage.getFirstLastWithCountryAndAge(country,thresholdAge);
        String expected = "Ms Sage Roob, Qatar, 31";
        assertEquals(expected,actual);
    }
}