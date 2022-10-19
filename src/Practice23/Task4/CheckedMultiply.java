package Practice23.Task4;

public class CheckedMultiply extends BinaryOperation {
	public CheckedMultiply(TripleExpression left, TripleExpression right) {
		super(left, right);
	}

	protected int evaluate(int left, int right) {
		if (right > 0 ? left > Integer.MAX_VALUE / right
				|| left < Integer.MIN_VALUE / right
				: (right < -1 ? left > Integer.MIN_VALUE / right
				|| left < Integer.MAX_VALUE / right
				: right == -1
				&& left == Integer.MIN_VALUE)) {
			throw new ArithmeticParserException("Overflow exception : " + left + "*" + right);
		}
		return left * right;
	}
}
