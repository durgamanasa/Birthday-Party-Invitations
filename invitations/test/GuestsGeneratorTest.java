import org.junit.Assert;
import org.junit.Test;

public class GuestsGeneratorTest {
    @Test
    public void test_generateGuests_should_return_the_all_the_guests_from_the_given_records() throws Exception {
        RecordsReader records = new RecordsReader("../invitations/data/records.txt");
        RecordsSeparator data = new RecordsSeparator(records.readRecords());
        SeparateRecords separatedRecords = data.separateEachRecord();
        GuestsGenerator generator = new GuestsGenerator(separatedRecords);
        GuestsList guests = generator.generateGuests();
        Assert.assertEquals(500, guests.size());
    }
}