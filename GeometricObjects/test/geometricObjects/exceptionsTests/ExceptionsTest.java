package geometricObjects.exceptionsTests;

import org.testng.annotations.Test;

import epam.saratov.homeWork.testng.objects.GeometricObjects;

public class ExceptionsTest {

	private static final double NEGATIVE_SIDE = -7;
	private GeometricObjects figure = new GeometricObjects();

	@Test(expectedExceptions = ArithmeticException.class, expectedExceptionsMessageRegExp = "Negative side exception!")
	public void quadrateCreationNegativeSide() {
		figure.getQuadrate(NEGATIVE_SIDE);
		throw new ArithmeticException("Negative side exception!");
	}

}
