import org.junit.Test;

import java.util.ArrayList;

public class DetailsTest {
    @Test
    public void test_getPersonDetails_should_return_the_details_oe_a_person() throws Exception {
        String fileName = "../invitations/data/records.txt";
        RecordsReader records = new RecordsReader(fileName);
        Details data = new Details(records.readRecords());
        ArrayList<String[]> separatedRecords = data.seperateEachRecord();
        data.callEachPerson(separatedRecords, "FirstLast");
    }
}