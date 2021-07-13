import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

/**
 * Demonstration of @Factory TestNG tests
 */
@Test
public class FactoryTests {
    private int num;
    DemoClass demoClass = new DemoClass();

    private int m_numberOfTimes;
    public FactoryTests(int num) {
        num = num;
    }

    @Test(groups = {"tests", "positive"})
    public void positiveTest() {
        boolean result = demoClass.isInteger(num);
        AssertJUnit.assertTrue(result);
    }
}


