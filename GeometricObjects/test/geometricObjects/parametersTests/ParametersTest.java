package geometricObjects.parametersTests;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Circle;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Quadrate;
import epam.saratov.homeWork.testng.objects.GeometricObjects.Rectangle;

public class ParametersTest {

	private GeometricObjects figure = new GeometricObjects();
	private static final double DELTA = 0.01;
	private static final String OPTIONAL_1 = "5";
	private static final double CIRCUMFERENCE_FORMULA = 2;
	private static final String OPTIONAL_2 = "6";
	private static final double PERIMETER_QUADRATE_FORMULA = 4;
	private static final String OPTIONAL_3 = "7";

	@Parameters("parameter_1")
	@Test
	public void circleCircumferenceTest(@Optional(OPTIONAL_1) double parameter) {
		Circle circle = figure.getCircle(parameter);
		double actualResult = circle.getCircumference();
		double expectedResult = CIRCUMFERENCE_FORMULA * parameter * Math.PI;
		Assert.assertEquals(actualResult, expectedResult, DELTA,
				"Circumference is not correct. Expected: " + expectedResult
						+ " Actual: " + actualResult);
	}

	@Parameters("parameter_2")
	@Test
	public void quadratePerimeterTest(@Optional(OPTIONAL_2) double parameter) {
		Quadrate quadrate = figure.getQuadrate(parameter);
		double actualResult = quadrate.getPerimeter();
		double expectedResult = PERIMETER_QUADRATE_FORMULA * parameter;
		Assert.assertEquals(actualResult, expectedResult, DELTA,
				"Perimeter is not correct. Expected: " + expectedResult
						+ " Actual: " + actualResult);
	}

	@Parameters("parameter_3")
	@Test
	public void rectanglePerimeterTest(@Optional(OPTIONAL_3) double parameter) {
		Rectangle rectangle = figure.getRectangle(parameter, parameter);
		double actualResult = rectangle.getPerimeter();
		double expectedResult = 2 * (parameter + parameter);
		Assert.assertEquals(actualResult, expectedResult, DELTA,
				"Perimeter is not correct. Expected: " + expectedResult
						+ " Actual: " + actualResult);
	}
}
