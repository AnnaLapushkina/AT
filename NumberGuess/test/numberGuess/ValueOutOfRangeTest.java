package numberGuess;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ValueOutOfRangeTest {
	private static final int LEFT_BORDER = 1;
	private static final int RIGHT_BORDER = 100;
	private static final String OUT_OF_RANGE_LEFT = "-3";
	private static final String OUT_OF_RANGE_RIGHT = "101";
	private static final String MESSAGE = "a number next time";

	private NumberGuessBean numberGuessBean;
	private Random random;

	@Before
	public void createObject() {
		this.numberGuessBean = new NumberGuessBean();
		this.random = new Random();
	}

	@After
	public void breakObject() {
		this.numberGuessBean = null;
	}

	@Test
	public void testOutOfRange() {

		int range = this.random.nextInt();
		int value;

		if (range >= LEFT_BORDER && range <= RIGHT_BORDER) {
			range -= 200;
		}
		value = this.numberGuessBean.getNumGuesses();
		this.numberGuessBean.setGuess(OUT_OF_RANGE_LEFT);
		assertEquals(MESSAGE, this.numberGuessBean.getHint());
		assertEquals(value + 1, this.numberGuessBean.getNumGuesses());

		value = this.numberGuessBean.getNumGuesses();
		this.numberGuessBean.setGuess(OUT_OF_RANGE_RIGHT);
		assertEquals(MESSAGE, this.numberGuessBean.getHint());
		assertEquals(value + 1, this.numberGuessBean.getNumGuesses());

		value = this.numberGuessBean.getNumGuesses();
		this.numberGuessBean.setGuess(String.valueOf(range));
		assertEquals(MESSAGE, this.numberGuessBean.getHint());
		assertEquals(value + 1, this.numberGuessBean.getNumGuesses());
	}

}
