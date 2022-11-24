package Practice23.Task3;

class Add extends Operation {
	public Add(TripleExpression left, TripleExpression right) {
		super(left, right);
	}

	protected int evaluate(int left, int right) {
		return left + right;
	}

}
