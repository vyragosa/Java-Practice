package Practice19.Task2;

class StudentNotFoundException extends Exception {
	public StudentNotFoundException() {
		super("Студент не найден!");
	}

	public StudentNotFoundException(String message) {
		super(message);
	}

	public StudentNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public StudentNotFoundException(Throwable cause) {
		super(cause);
	}

	public StudentNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
