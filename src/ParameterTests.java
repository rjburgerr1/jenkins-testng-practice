import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTests {
    DemoClass demoClass = new DemoClass();

    // Simple test with @Parameters annotation
    @Parameters({"num"})
    @Test()
    public void test(double num) {
        boolean result = demoClass.isInteger(num);
        AssertJUnit.assertTrue(result);
    }

    // Complex version of TestNG parameters using DataProviders
    @DataProvider(name ="DataProvider")
    public Object[][] createData() {
        return new Object[][] {
                {new Integer(12)}
        };
    }

    @Test(dataProvider = "DataProvider")
    public void dataProviderTest(double num) {
        boolean result = demoClass.isInteger(num);
        AssertJUnit.assertTrue(result);
    }
}
