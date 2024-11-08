package exception;

public class OutOfBoundDigitsException extends Exception{

	public static void validateDigits (long number)throws OutOfBoundDigitsException {
		String str;
		int str_length;
		boolean isValid = false;
		str = Long.toString(number);
		str_length = str.length();
		if(str_length==10) {
			isValid = true;
		}else {
			isValid = false;
		}
		if(isValid == false) {
			throw new OutOfBoundDigitsException();
		}
	}

}
