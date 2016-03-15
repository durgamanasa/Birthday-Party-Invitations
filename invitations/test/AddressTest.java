import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AddressTest {

    @Test
    public void test_isSameCountry_should_return_true_if_the_country_is_same_as_the_given_country() throws Exception {
        City city = new City("Kalidindi");
        State state = new State("Andhra Pradesh");
        Country country = new Country("India");
        Address address = new Address(city,state,country);

        assertTrue(address.isSameCountry(new Country("India")));
    }

    @Test
    public void test_isSameCountry_should_return_false_if_the_country_is_not_same_as_the_given_country() throws Exception {
        City city = new City("Kalidindi");
        State state = new State("Andhra Pradesh");
        Country country = new Country("India");
        Address address = new Address(city,state,country);

        assertFalse(address.isSameCountry(new Country("Pakistan")));
    }
}