package Practice23.Task4;

public class CheckedNegate extends UnaryOperation {
	public CheckedNegate(TripleExpression object) {
		super(object);
	}

	protected int evaluate(int object) {
		if (object == Integer.MIN_VALUE)
			throw new ArithmeticParserException("Overflow exception : -(" + object + ")");
		return -object;
	}
}
