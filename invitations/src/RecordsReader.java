import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RecordsReader {
    private final String fileName;

    public RecordsReader(String fileName) {
        this.fileName = fileName;
    }

    public RecordsList readRecords() throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line;
        RecordsList records = new RecordsList();
        while ((line = br.readLine()) != null) {
            records.addRecord(line);
        }
        return records;
    }
}
