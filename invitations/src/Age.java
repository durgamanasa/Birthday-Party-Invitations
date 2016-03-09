public class Age {
    private final String age;

    public Age(String age) {
        this.age = age;
    }

    public int getAge(){
        return Integer.parseInt(this.age);
    }
}
