public class Person {
    private final Name name;
    private final Gender gender;
    private final int age;
    private final Address address;

    public Person(Name name, Gender gender, int age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String getFirstLast() {
        return name.firstLast();
    }

    public String getFirstLastWithTitle() {
        return name.firstLastWith(gender);
    }

    public String getLastFirst() {
        return name.lastFirst();
    }

    public String getLastFirstWithTitle() {
        return name.lastFirstWith(gender);
    }
}
