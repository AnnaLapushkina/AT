package geometricObjects.factoryTests;

import geometricObjects.concreteTests.CircleTest;
import geometricObjects.concreteTests.QuadrateTest;
import geometricObjects.concreteTests.RectangleTest;

import org.testng.annotations.Factory;

public class FactoryTest {

	@Factory
	public Object[] createFactoryTest() {
		Object[] result = new Object[2];
		result[0] = new CircleTest();
		result[1] = new QuadrateTest();
		result[2] = new RectangleTest();

		return result;
	}
}
