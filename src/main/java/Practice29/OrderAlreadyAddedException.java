package Practice29;

public class OrderAlreadyAddedException extends Exception {
	public OrderAlreadyAddedException() {
		super("Order already added");
	}

	public OrderAlreadyAddedException(String message) {
		super(message);
	}

	public OrderAlreadyAddedException(String message, Throwable cause) {
		super(message, cause);
	}

	public OrderAlreadyAddedException(Throwable cause) {
		super(cause);
	}

	public OrderAlreadyAddedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}

