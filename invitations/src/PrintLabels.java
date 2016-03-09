import java.io.IOException;
import java.util.ArrayList;

public class PrintLabels {
    public static void main(String[] args) throws IOException {
        RecordsReader records = new RecordsReader(args[2]);
        Details data = new Details(records.readRecords());
        ArrayList<String[]> separatedRecords = data.seperateEachRecord();
        data.callEachPerson(separatedRecords, args[0]);
    }
}
