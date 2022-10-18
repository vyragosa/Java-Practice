package Practice19.Task1;

class INNException extends Exception {
	public INNException() {
		super("ИНН правильный");
	}

	public INNException(String message) {
		super(message);
	}

	public INNException(String message, Throwable cause) {
		super(message, cause);
	}

	public INNException(Throwable cause) {
		super(cause);
	}

	public INNException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
