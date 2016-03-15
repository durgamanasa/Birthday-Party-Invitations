import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArgumentsSeparatorTest {
    String[] args = {"--firstLastWithCountry", "--country:Romania", "--age:30", "./invitations/data/records.txt"};
    ArgumentsSeparator argsSeparator = new ArgumentsSeparator(args);

    @Test
    public void test_separateOption_should_return_the_option_from_user_arguments() throws Exception {
        assertEquals("--firstLastWithCountry", argsSeparator.separateOption());
    }

    @Test
    public void test_separateCountry_should_return_the_country_from_user_arguments() throws Exception {
        System.out.println(argsSeparator.separateCountry());
        assertEquals("Romania", argsSeparator.separateCountry());
    }

    @Test
    public void test_separateFile_should_return_the_file_name_from_user_arguments() throws Exception {
        assertEquals("./invitations/data/records.txt", argsSeparator.separateFile());
    }

    @Test
    public void test_separateAge_should_return_the_age_from_user_arguments() throws Exception {
        assertEquals(30, argsSeparator.separateAge());
    }
}