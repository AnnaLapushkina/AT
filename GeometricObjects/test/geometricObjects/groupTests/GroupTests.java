package geometricObjects.groupTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Circle;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Quadrate;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Rectangle;

public class GroupTests {

	private static final double PERIMETER_QUADRATE_FORMULA = 4;
	private static final double SIDE = 4;
	private static final double RADIUS = 5;
	private static final double CIRCUMFERENCE_FORMULA = 2;
	private static final double SIDE_ONE = 4;
	private static final double SIDE_TWO = 6;
	private static final double PERIMETER_RECTANGLE_FORMULA = 2;
	private static final double DELTA = 0.01;
	private GeometricObjects figure = new GeometricObjects();
	private Circle circle;
	private Rectangle rectangle;
	private Quadrate quadrate;

	@Test(groups = "creationGroup")
	public void quadrateCreation() {
		this.quadrate = figure.getQuadrate(SIDE);
	}

	@Test(groups = "perimeterGroup", dependsOnGroups = "creationGroup")
	
	public void perimeterQuadrateTest() {
		double actualResult = quadrate.getPerimeter();
		double expectedResult = PERIMETER_QUADRATE_FORMULA * SIDE;
		Assert.assertEquals(actualResult, expectedResult, DELTA,
				"Perimeter is not correct. Expected: " + expectedResult
						+ " Actual: " + actualResult);
	}
	

	@Test(groups = "creationGroup")
	public void circleCreation() {
		this.circle = figure.getCircle(RADIUS);
	}

	@Test(groups = "perimeterGroup", dependsOnGroups = "creationGroup")
	public void circumferenceTest() {
		double actualResult = circle.getCircumference();
		double expectedResult = CIRCUMFERENCE_FORMULA * RADIUS * Math.PI;
		Assert.assertEquals(actualResult, expectedResult, DELTA,
				"Length is not correct. Expected: " + expectedResult
						+ " Actual: " + actualResult);
	}

	@Test(groups = "creationGroup")
	public void rectangleCreation() {
		this.rectangle = figure.getRectangle(SIDE_ONE, SIDE_TWO);
	}

	@Test(groups = "perimeterGroup", dependsOnGroups = "creationGroup")
	public void perimeterRectangleTest() {
		double actualResult = rectangle.getPerimeter();
		double expectedResult = PERIMETER_RECTANGLE_FORMULA * (SIDE_ONE + SIDE_TWO);
		Assert.assertEquals(actualResult, expectedResult, DELTA,
				"Perimeter is not correct. Expected: " + expectedResult
						+ " Actual: " + actualResult);
	}
}
