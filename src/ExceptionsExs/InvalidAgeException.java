package ExceptionsExs;

public class InvalidAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String str) {
		// calling the constructor of parent Exception
		super(str);
	}
}

// class that uses custom exception InvalidAgeException  
