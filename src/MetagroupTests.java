import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Example test class utilizing TestNG metagroups
 */
public class MetagroupTests {
	DemoClass demoClass = new DemoClass();


	@Test(groups = {"tests", "empty", "metagroup1"})
	public void metagroupTest() {

	}

	@Test(groups = {"tests", "empty", "metagroup1"})
	public void metagroupTest2() {

	}

	@Test(groups = {"tests", "empty", "metagroup2"})
	public void metagroupTest3() {

	}
	@Test(groups = {"tests", "empty", "metagroup2"})
	public void metagroupTest4() {

	}
	
}