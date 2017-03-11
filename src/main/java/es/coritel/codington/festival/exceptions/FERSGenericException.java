package es.coritel.codington.festival.exceptions;

@SuppressWarnings("serial")
public class FERSGenericException extends RuntimeException {

	public FERSGenericException(String message, Throwable object) {
		super(message, object);

	}

	public FERSGenericException(String message) {
		super(message);
	}

}
