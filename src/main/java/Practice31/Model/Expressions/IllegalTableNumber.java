package Practice31.Model.Expressions;

public class IllegalTableNumber extends Exception {
	public IllegalTableNumber() {
		super("Неверный номер столика");
	}

	public IllegalTableNumber(String message) {
		super(message);
	}

	public IllegalTableNumber(String message, Throwable cause) {
		super(message, cause);
	}

	public IllegalTableNumber(Throwable cause) {
		super(cause);
	}

	public IllegalTableNumber(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}