package geometricObjects.concreteTests;

import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Quadrate;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class QuadrateTest {

	private static final double SIDE = 5;
	private static final double PERIMETER_FORMULA = 4;
	private static final double DELTA = 0.01;
	private GeometricObjects figure;
	private Quadrate quadrate;

	@BeforeClass
	public void quadrateCreation() {
		this.figure = new GeometricObjects();
		this.quadrate = figure.getQuadrate(SIDE);
	}

	@Test(dependsOnMethods = "squareTest")
	public void perimeterTest() {
		double actualResult = quadrate.getPerimeter();
		double expectedResult = PERIMETER_FORMULA * SIDE;
		Assert.assertEquals(actualResult, expectedResult, DELTA,
				"Perimeter is not correct. Expected: " + expectedResult
						+ " Actual: " + actualResult);

	}

	@Test
	public void squareTest() {
		double actualResult = quadrate.getSquare();
		double expectedResult = SIDE * SIDE;
		Assert.assertEquals(actualResult, expectedResult, DELTA,
				"Square is not correct. Expected: " + expectedResult
						+ " Actual: " + actualResult);
	}
}
