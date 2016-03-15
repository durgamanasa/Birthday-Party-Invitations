import org.junit.Assert;
import org.junit.Test;

public class AgeTest {
    @Test
    public void test_getAge_should_return_the_age_as_integer() throws Exception {
        Age age = new Age(19);
        Assert.assertEquals(19,age.getAge());
    }
}