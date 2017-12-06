import org.junit.Assert;
import org.junit.Test;

public class NullIssuesTest {

    @Test
    public void nullBooleanTest() {
        NullIssues tester = new NullIssues();
        Assert.assertNull(tester.ReturnNull());
    }

    @Test
    public void avoidNullPointerExceptionTest() {
        NullIssues tester = new NullIssues();
        Assert.assertEquals(5,tester.avoidNullPointerException("abc"));
    }

    @Test
    public void nullShouldNotBeUsedWithOptionalTest(){
        NullIssues tester = new NullIssues();
        Assert.assertEquals(0,tester.nullShouldNotBeUsedWithOptional());
    }
}
