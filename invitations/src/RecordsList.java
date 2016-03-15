import java.util.ArrayList;
import java.util.Iterator;

public class RecordsList {

    private final ArrayList<String> listOfRecords;

    public RecordsList() {
        this.listOfRecords = new ArrayList<>();
    }

    public Iterator iterator() {
        return listOfRecords.iterator();
    }

    public void addRecord(String eachRecord) {
        listOfRecords.add(eachRecord);
    }

    public int size() {
        return listOfRecords.size();
    }


}
