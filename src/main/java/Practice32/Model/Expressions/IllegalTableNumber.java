package Practice32.Model.Expressions;

import java.io.Serializable;

public class IllegalTableNumber extends Exception implements Serializable {
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