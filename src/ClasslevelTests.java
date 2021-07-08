import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Demonstration of class level annotations TestNG tests
 */
@Test
public class ClasslevelTests {
        // Test that depends on trueTest running and passing before it can run.
        public void emptyTest() {

        }

        // Test that always passes
        @Test() // Can still add the @test annotation if you need to add attributes to test
        public void trueTest() {
            Assert.assertTrue(true, "True");
        }

}
