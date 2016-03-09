import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void test_getFirstLast_should_return_the_name_as_first_and_last() throws Exception {
        Name name = new Name("Julius", "Barrows");
        Address address = new Address(new City("Veda haven"),new State("Vermont"),new Country("Macedonia"));
        Age age = new Age("18");
        Person julius = new Person(name, Gender.Female, age, address);
        assertEquals("Julius Barrows", julius.getFirstLast());
    }

    @Test
    public void test_getFirstLastWithTitle_should_return_the_name_as_first_and_last_with_title() throws Exception {
        Name name = new Name("Julius", "Barrows");
        Address address = new Address(new City("Veda haven"), new State("Vermont"),new Country("Macedonia"));
        Age age = new Age("18");
        Person julius = new Person(name, Gender.Female, age, address);
        assertEquals("Ms Julius Barrows", julius.getFirstLastWithTitle());
    }

    @Test
    public void test_getLastFirst_should_return_the_name_as_last_and_first() throws Exception {
        Name name = new Name("Gavin", "Hyatt");
        Address address = new Address(new City("Crooks ton"),new State("Illinois"),new Country("Romania"));
        Age age = new Age("36");
        Person gavin = new Person(name, Gender.Male, age, address);
        assertEquals("Hyatt, Gavin", gavin.getLastFirst());
    }

    @Test
    public void test_getLastFirstWithTitle_should_return_the_name_as_last_and_first_with_title() throws Exception {
        Name name = new Name("Gavin", "Hyatt");
        Address address = new Address(new City("Crooks ton"), new State("Illinois"),new Country("Romania"));
        Age age = new Age("36");
        Person gavin = new Person(name, Gender.Male, age, address);
        assertEquals("Mr Hyatt, Gavin", gavin.getLastFirstWithTitle());
    }
}