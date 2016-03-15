public class Age {
    private final int age;

    public Age(int age) {
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }


    public boolean isAboveAge(int threshold) {
        return this.age > threshold;
    }
}
