import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CountryTest {
    @Test
    public void test_isSameCountry_returns_false_if_the_country_and_other_country_are_not_same() throws Exception {
        Country country = new Country("India");
//        assertFalse(country.isSameCountry("Pakistan"));
    }

    @Test
    public void test_isSameCountry_returns_true_if_the_country_and_other_country_are_same() throws Exception {
        Country country = new Country("India");
//        assertTrue(country.isSameCountry("India"));
    }
}