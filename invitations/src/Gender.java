public enum Gender {
    Male("Mr"),
    Female("Ms");

    private final String prefix;

    Gender(String s) {
        prefix = s;
    }

    public String getPrefix(){
        return prefix;
    }
}
