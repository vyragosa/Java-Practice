package Practice23.Task4;

public class CheckedAbs extends UnaryOperation {
	public CheckedAbs(TripleExpression object) {
		super(object);
	}

	protected int evaluate(int object) {
		if (object == Integer.MIN_VALUE) {
			throw new ArithmeticParserException("Overflow exception : abs(" + object + ")");
		}
		return object < 0 ? -object : object;
	}

}
