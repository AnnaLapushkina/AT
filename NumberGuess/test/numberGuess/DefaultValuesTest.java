package numberGuess;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DefaultValuesTest {
	
	private static final int LEFT_BORDER = 1;
	private static final int RIGHT_BORDER = 100;
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
	public void testDefaultValues() {

		assertTrue(this.numberGuessBean.getNumGuesses() == 0);
		assertTrue(this.numberGuessBean.getSuccess() == false);
		assertTrue(this.numberGuessBean.answer >= LEFT_BORDER
				&& this.numberGuessBean.answer <= RIGHT_BORDER);
		assertTrue(this.numberGuessBean.hint == null);
	}

}
