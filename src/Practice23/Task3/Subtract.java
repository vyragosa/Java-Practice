package Practice23.Task3;

public class Subtract extends Operation {
	public Subtract(TripleExpression left, TripleExpression right) {
		super(left, right);
	}

	protected int evaluate(int left, int right) {
		return left - right;
	}

}
