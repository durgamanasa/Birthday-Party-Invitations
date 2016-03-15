import java.util.Iterator;

public class RecordsSeparator {
    private final RecordsList records;

    public RecordsSeparator(RecordsList records) {
        this.records = records;
    }

    public SeparateRecords separateEachRecord() {
        SeparateRecords separatedRecords = new SeparateRecords();
        Iterator iterator = records.iterator();
        while (iterator.hasNext()){
            String eachRecord = (String) iterator.next();
            String[] record = eachRecord.split(",");
            separatedRecords.addRecord(record);
        }
        return separatedRecords;
    }
}