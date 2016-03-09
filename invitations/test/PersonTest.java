import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void testgetFirstLast_should_return_the_name_as_first_and_last() throws Exception {
        Name name = new Name("Julius", "Barrows");
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
        Person julius = new Person(name, Gender.Female, 18, address);
        assertEquals("Julius Barrows", julius.getFirstLast());
    }

    @Test
    public void testgetFirstLastWithTitle_should_return_the_name_as_first_and_last_with_title() throws Exception {
        Name name = new Name("Julius", "Barrows");
        Address address = new Address("Veda haven", "Vermont", "Macedonia");
        Person julius = new Person(name, Gender.Female, 18, address);
        assertEquals("Ms Julius Barrows", julius.getFirstLastWithTitle());
    }

    @Test
    public void testgetLastFirst_should_return_the_name_as_last_and_first() throws Exception {
        Name name = new Name("Gavin", "Hyatt");
        Address address = new Address("Crooks ton", "Illinois", "Romania");
        Person gavin = new Person(name, Gender.Male, 36, address);
        assertEquals("Hyatt, Gavin", gavin.getLastFirst());
    }

    @Test
    public void testgetLastFirstWithTitle_should_return_the_name_as_last_and_first_with_title() throws Exception {
        Name name = new Name("Gavin", "Hyatt");
        Address address = new Address("Crooks ton", "Illinois", "Romania");
        Person gavin = new Person(name, Gender.Male, 36, address);
        assertEquals("Mr Hyatt, Gavin", gavin.getLastFirstWithTitle());
    }
}