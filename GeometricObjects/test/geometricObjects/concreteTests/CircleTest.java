package geometricObjects.concreteTests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Circle;

public class CircleTest {
	private static final double RADIUS = 5;
	private static final double CIRCUMFERENCE_FORMULA = 2;
	private static final double DELTA = 0.01;
	private GeometricObjects figure;
	private Circle circle;

	@BeforeClass
	public void circleCreation() {
		this.figure = new GeometricObjects();
		this.circle = figure.getCircle(RADIUS);
	}
	@Test
	public void circumferenceTest() {
		double actualResult = circle.getCircumference();
		double expectedResult = CIRCUMFERENCE_FORMULA * RADIUS * Math.PI;
		Assert.assertEquals(actualResult, expectedResult, DELTA,
				"Length is not correct. Expected: " + expectedResult
						+ " Actual: " + actualResult);
	}
	@Test(dependsOnMethods="circumferenceTest")
	public void squareTest() {
		double actualResult = circle.getSquare();
		double expectedResult = RADIUS * RADIUS * Math.PI;
		Assert.assertEquals(actualResult, expectedResult, DELTA,
				"Square is not correct. Expected: " + expectedResult
						+ " Actual: " + actualResult);
	}
}
