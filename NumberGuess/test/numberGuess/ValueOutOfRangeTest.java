package numberGuess;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ValueOutOfRangeTest {

	private static final String OUT_OF_RANGE_LEFT = "-3";
	private static final String OUT_OF_RANGE_RIGHT = "105";
	private static final String WRONG_VALUE = "%#$%";
	private static final String MESSAGE = "a number next time";

	private NumberGuessBean numberGuessBean;

	@Before
	public void createObject() {
		this.numberGuessBean = new NumberGuessBean();

	}

	@After
	public void breakObject() {
		this.numberGuessBean = null;
	}

	@Test
	public void testOutOfRange() {

		this.numberGuessBean.setGuess(OUT_OF_RANGE_LEFT);
		assertEquals(MESSAGE, this.numberGuessBean.getHint());

		this.numberGuessBean.setGuess(OUT_OF_RANGE_RIGHT);
		assertEquals(MESSAGE, this.numberGuessBean.getHint());

		this.numberGuessBean.setGuess(WRONG_VALUE);
		assertEquals(MESSAGE, this.numberGuessBean.getHint());

	}

}

