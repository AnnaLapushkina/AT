package geometricObjects.concreteTests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Rectangle;

public class RectangleTest {
	private static final double SIDE_ONE = 1;
	private static final double SIDE_TWO = 9;
	private static final double PERIMETER_FORMULA = 2;
	private static final double DELTA = 0.01;
	private GeometricObjects figure;
	private Rectangle rectangle;

	@BeforeClass
	public void rectangleCreation() {
		this.figure = new GeometricObjects();
		this.rectangle = figure.getRectangle(SIDE_ONE, SIDE_TWO);
	}
	@Test(priority = 1)
	public void perimeterTest() {
		double actualResult = rectangle.getPerimeter();
		double expectedResult = PERIMETER_FORMULA * (SIDE_ONE + SIDE_TWO);
		Assert.assertEquals(actualResult, expectedResult, DELTA,
				"Perimeter is not correct. Expected: " + expectedResult
						+ " Actual: " + actualResult);

	}
	@Test(priority = 2)
	public void squareTest() {
		double actualResult = rectangle.getSquare();
		double expectedResult = SIDE_ONE * SIDE_TWO;
		Assert.assertEquals(actualResult, expectedResult, DELTA,
				"Square is not correct. Expected: " + expectedResult
						+ " Actual: " + actualResult);
	}
	@Test(priority = 0)
	public void isQuadrateTest() {
		//boolean actualResult = rectangle.isQuadrate();
		//boolean expectedResult = false;
		Assert.assertTrue(rectangle.isQuadrate(),
				"Sides are equal. Expected: " 
						+ " Actual: " );
	}
}