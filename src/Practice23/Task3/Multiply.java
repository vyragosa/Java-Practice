package Practice23.Task3;

class Multiply extends Operation {

	public Multiply(TripleExpression left, TripleExpression right) {
		super(left, right);
	}

	protected int evaluate(int left, int right) {
		return left * right;
	}

}
