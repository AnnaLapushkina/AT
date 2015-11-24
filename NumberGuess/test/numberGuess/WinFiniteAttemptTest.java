package numberGuess;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WinFiniteAttemptTest {
	private static final int FORMULA = 2;
	private static final double FORMULA_DOUBLE = 2.0;
	private static final String TRY_MESSAGE = "Try ";
	private static final String SUCCESS_MESSAGE = "\nSuccess: attempt ";
	private static final String SUCCESS_MESSAGE_ANSWER = " ; answer = ";
	private static final String FAIL_MESSAGE = " - fail(";
	private static final String HINT = "lower";
	private static final String LEFT_BRACKET = "[";
	private static final String SEMICOLON = " ; ";
	private static final String DELTA_MESSAGE = " ] ; delta = ";

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
	public void testWinFiniteAttempt() {
		int i;
		int border_left = 0;
		int border_right = 100;
		int delta;

		i = Math.round((border_right - border_left) / FORMULA);

		while (this.numberGuessBean.getSuccess() != true) {
			System.out.print(TRY_MESSAGE + i);

			this.numberGuessBean.setGuess(String.valueOf(i));
			if (this.numberGuessBean.getSuccess() == true) {
				System.out.println(SUCCESS_MESSAGE
						+ this.numberGuessBean.getNumGuesses()
						+ SUCCESS_MESSAGE_ANSWER + this.numberGuessBean.answer);
			} else {
				System.out.println(FAIL_MESSAGE);

				if (this.numberGuessBean.getHint().equalsIgnoreCase(HINT)) {
					border_right = i;
					delta = (int) Math.ceil((border_right - border_left)
							/ FORMULA_DOUBLE);
					i = border_left + delta;
					System.out.println(LEFT_BRACKET + border_left + SEMICOLON
							+ border_right + DELTA_MESSAGE + delta);
				}

				else {
					border_left = i;
					delta = (int) Math.ceil((border_right - border_left)
							/ FORMULA_DOUBLE);
					i = border_left + delta;
					System.out.println(LEFT_BRACKET + border_left + SEMICOLON
							+ border_right + DELTA_MESSAGE + delta);
				}
			}
		}

	}

}
