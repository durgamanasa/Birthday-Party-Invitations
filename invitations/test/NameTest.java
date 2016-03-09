import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameTest {
    @Test
    public void testfirstLast_should_return_name_as_first_last() throws Exception {
        Name simran = new Name("Simran", "Pal");
        assertEquals("Simran Pal", simran.firstLast());
    }

    @Test
    public void testfirstLastWith_should_return_name_as_first_last_with_title() throws Exception {
        Name simran = new Name("Simran", "Pal");
        Gender title = Gender.Female;
        assertEquals("Ms Simran Pal", simran.firstLastWith(title));
    }

    @Test
    public void testlastFirst_should_return_name_as_last_and_first() throws Exception {
        Name bindu = new Name("Bindu","S");
        assertEquals("S, Bindu",bindu.lastFirst());
    }

    @Test
    public void testlastFirstWith_should_return_name_as_last_first_with_title() throws Exception {
        Name bindu = new Name("Bindu","S");
        Gender title = Gender.Female;
        assertEquals("Ms S, Bindu",bindu.lastFirstWith(title));
    }
}