import java.util.ArrayList;

public class Details {
    private final ArrayList<String> records;

    public Details(ArrayList<String> records) {
        this.records = records;
    }

    public ArrayList<String[]> seperateEachRecord() {
        ArrayList<String[]> seperatedRecords = new ArrayList<>();
        for (int i = 0; i < records.size(); i++) {
            String[] record = records.get(i).split(",");
            seperatedRecords.add(record);
        }
        return seperatedRecords;
    }

    public void callEachPerson(ArrayList<String[]> allRecords, String option) {
        for (int i = 0; i < allRecords.size(); i++) {
            Name name = new Name(allRecords.get(i)[0], allRecords.get(i)[1]);
            Gender gender;
            if (allRecords.get(i)[2].equals("Female")) {
                gender = Gender.Female;
            } else {
                gender = Gender.Male;
            }
            City city = new City(allRecords.get(i)[4]);
            State state = new State(allRecords.get(i)[5]);
            Country country = new Country(allRecords.get(i)[6]);
            Address address = new Address(city,state,country);
            Age age = new Age(allRecords.get(i)[3]);
            Person eachPerson = new Person(name, gender, age, address);
            switch (option) {
                case "firstLast":
                    System.out.println(eachPerson.getFirstLast());
                    break;
                case "lastFirst":
                    System.out.println(eachPerson.getLastFirst());
                    break;
                case "firstLastWithTitle":
                    System.out.println(eachPerson.getFirstLastWithTitle());
                    break;
                case "lastFirstWithTitle":
                    System.out.println(eachPerson.getLastFirstWithTitle());
                    break;
            }
        }
    }
}
