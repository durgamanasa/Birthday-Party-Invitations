import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GuestsFilterTest {
    @Test
    public void test_filterGuestsByCountry_should_return_guests_from_specific_country_only() throws Exception {
        RecordsReader records = new RecordsReader("../invitations/data/records.txt");
        final RecordsList listOfRecords = records.readRecords();
        RecordsSeparator data = new RecordsSeparator(listOfRecords);
        final SeparateRecords separatedRecords = data.separateEachRecord();
        GuestsGenerator guestsGenerator = new GuestsGenerator(separatedRecords);
        final GuestsList guestsList = guestsGenerator.generateGuests();
        GuestsFilter guestsFilter = new GuestsFilter(guestsList);
        GuestsList filteredList = guestsFilter.filterGuestsByCountry("Qatar");

        assertNotEquals(500,filteredList.size());
        assertEquals(98,filteredList.size());

    }
}