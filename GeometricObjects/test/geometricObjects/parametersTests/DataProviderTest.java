package geometricObjects.parametersTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Rectangle;

public class DataProviderTest {
	private static double DELTA = 0.01;
	private GeometricObjects figure = new GeometricObjects();

	@DataProvider(name = "RectangleSquareParameters")
	public Object[][] getValue() {
		return new Object[][] { new Object[] { 4, 8 }, new Object[] { 0, 8 },
				new Object[] { -1, 8 } };
	}

	@Test(dataProvider = "RectangleSquareParameters")
	public void rectangleTest(double sideOne, double sideTwo) {
		Rectangle rectangle = figure.getRectangle(sideOne, sideTwo);
		double actualResult = rectangle.getSquare();
		double expectedResult = sideOne * sideTwo;

		Assert.assertEquals(actualResult, expectedResult, DELTA,
				"Square is not correct. Expected: " + expectedResult
						+ " Actual: " + actualResult);
	}

}
