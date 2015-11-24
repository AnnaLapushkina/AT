package numberGuess;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ValueHigherTest {

	private static final int ANSWER = 56;
	private static final String HIGHER_ANSWER = "64";
	private static final String HINT = "lower";
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
	public void testHint() {
		int n = this.numberGuessBean.getNumGuesses();
		this.numberGuessBean.answer = ANSWER;
		this.numberGuessBean.setGuess(HIGHER_ANSWER);
		assertEquals(HINT, this.numberGuessBean.getHint());
		assertEquals(n + 1, this.numberGuessBean.getNumGuesses());
	}

}
