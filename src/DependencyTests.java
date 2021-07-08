import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

/**
 * Demonstration of Hard and Soft dependencies with TestNG tests
 */
public class DependencyTests {

        // Test that depends on trueTest running and passing before it can run.
        @Test(dependsOnMethods = "trueTest" )
        public void emptyTest() {

        }

        // Test that always passes
        @Test()
        public void trueTest() {
            Assert.assertTrue(true, "True");
        }

        // Test that always fails
        @Test()
        public void failTest() {
                Assert.assertTrue(false, "True (Never will be)");
        }

        // This test will never run because it has a hard dependency failTest, a test which never passes
        // Ensures Order Only
        @Test(dependsOnMethods = "failTest")
        public void afterFailTest() {
        }

        // This test will runn because although it has a dependency on failTest, which never passes, the dependency is soft
        // Ensures Order and Success
        @Test(dependsOnMethods = "failTest", alwaysRun = true)
        public void afterFailTestSoft() {
        }




}
