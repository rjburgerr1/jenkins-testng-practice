import org.testng.annotations.Factory;

import java.util.concurrent.ThreadLocalRandom;

public class FactoryTestsFactory {

    @Factory
    public Object[] createInstances() {
        // Dynamically creates 10 test objects with 10 random integers to test
        Object[] result = new Object[10];
        for (int i = 0; i < 10; i++) {
            result[i] = new FactoryTests( ThreadLocalRandom.current().nextInt(0, 99999 + 1));
        }
        return result;
    }

}
