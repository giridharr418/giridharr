package com.virtusa.numbertoword;

import static com.virtusa.constants.Constants.*;

/**
 * 
 * @author giridhar
 * @since 1
 * @version 1
 *
 */
public class NumberToWord {

	public static String numberToWord(int number) {
		String numberTowordForm = "";
		int quotient = ZERO;
		int remainder = ZERO;
		int divisor = ZERO;
		try {
			if (number < ONE_BILLION && number >= ONE_MILLION) {
				divisor = ONE_MILLION;
				quotient = number / divisor;
				remainder = number % divisor;
				if (quotient != ZERO)
					numberTowordForm += numberToWord(quotient) + SPACE + MILLION;
				if (remainder != ZERO)
					numberTowordForm += numberToWord(remainder);
			} else if (number < ONE_MILLION && number >= TEN_THOUSANDS) {
				divisor = ONE_THOUSAND;
				quotient = number / divisor;
				remainder = number % divisor;
				if (quotient != ZERO)
					numberTowordForm += numberToWord(quotient) + SPACE + THOUSAND;
				if (remainder != ZERO)
					numberTowordForm += numberToWord(remainder);
			} else if (number < TEN_THOUSANDS && number >= ONE_THOUSAND) {
				divisor = ONE_THOUSAND;
				quotient = number / divisor;
				remainder = number % divisor;
				if (quotient != ZERO)
					numberTowordForm += numberMap.get(quotient) + SPACE + THOUSAND;
				if (remainder != ZERO)
					numberTowordForm += numberToWord(remainder);

			} else if (number < ONE_THOUSAND && number >= ONE_HUNDRED) {
				divisor = ONE_HUNDRED;
				quotient = number / divisor;
				remainder = number % divisor;
				if (quotient != ZERO)
					numberTowordForm += numberMap.get(quotient) + SPACE + HUNDRED;
				if (remainder != ZERO)
					numberTowordForm += " and " + numberToWord(remainder);

			} else if (number < ONE_HUNDRED && number >= TEN) {
				divisor = TEN;
				quotient = number / divisor;
				remainder = number % divisor;
				if (quotient != ZERO)
					numberTowordForm += numberMap.get(quotient * divisor);
				if (remainder != ZERO)
					numberTowordForm += numberMap.get(remainder);

			} else if (number < TEN && number >= ZERO) {
				numberTowordForm += numberMap.get(number);

			}
		} catch (Exception e) {
			// printing error message
			
			System.out.println("Error While Converting number to Word::" + e);
			e.printStackTrace();
		}
		return numberTowordForm != null ? numberTowordForm : CONVERSTION_ERROR_MESSAGE;
	}
}
