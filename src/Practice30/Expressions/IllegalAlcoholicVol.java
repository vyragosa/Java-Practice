package Practice30.Expressions;

public class IllegalAlcoholicVol extends Exception {
	public IllegalAlcoholicVol() {
		super("Illegal alcoholic volume");
	}

	public IllegalAlcoholicVol(String message) {
		super(message);
	}

	public IllegalAlcoholicVol(String message, Throwable cause) {
		super(message, cause);
	}

	public IllegalAlcoholicVol(Throwable cause) {
		super(cause);
	}

	public IllegalAlcoholicVol(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
