package Practice19.Task2;

class EmptyStringException extends IllegalArgumentException {
	public EmptyStringException() {
		super("Пустая строка не допускается!");
	}

	public EmptyStringException(String s) {
		super(s);
	}

	public EmptyStringException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmptyStringException(Throwable cause) {
		super(cause);
	}

}
