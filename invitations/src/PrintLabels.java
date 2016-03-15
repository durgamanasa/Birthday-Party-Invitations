import java.io.IOException;
import java.util.ArrayList;
public class PrintLabels {
    public static void main(String[] args) throws IOException {
        ArgumentsSeparator argsSeparator = new ArgumentsSeparator(args);
        RecordsReader data = new RecordsReader(argsSeparator.separateFile());
        RecordsList listOfRecords = data.readRecords();
        RecordsSeparator records = new RecordsSeparator(listOfRecords);
        SeparateRecords separatedRecords = records.separateEachRecord();
        GuestsGenerator guestsGenerator = new GuestsGenerator(separatedRecords);
        GuestsList guestsList = guestsGenerator.generateGuests();
        InviteGuests inviteGuests = new InviteGuests(guestsList);
        inviteGuests.printSpecificFormat(args);
    }
}
