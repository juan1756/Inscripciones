package exceptions;

public class AlumnoNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AlumnoNotFoundException(String message) {
		super(message);
	}

	public AlumnoNotFoundException(Throwable message) {
		super(message);
	}

}
