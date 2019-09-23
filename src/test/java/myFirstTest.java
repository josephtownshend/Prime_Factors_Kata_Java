import org.junit.Test;
import org.junit.Assert;

public class myFirstTest {

    @Test
    public void ATestMethod() {
        Assert.assertTrue(true);
    }

    @Test
    public void ASecondTestMethod() {
        Assert.assertFalse(false);
    }
}
