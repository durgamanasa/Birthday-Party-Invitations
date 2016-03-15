import java.util.ArrayList;
import java.util.Iterator;

public class SeparateRecords {
    private final ArrayList<String[]> separatedRecordsList;

    public SeparateRecords() {
        this.separatedRecordsList = new ArrayList<String[]>();
    }

    public Iterator iterator() {
        return separatedRecordsList.iterator();
    }

    public void addRecord(String[] eachRecord) {
        separatedRecordsList.add(eachRecord);
    }

    public int size() {
        return separatedRecordsList.size();
    }
}
