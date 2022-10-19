package Practice23.Task4;

class Divide extends Operation {
	public Divide(TripleExpression left, TripleExpression right) {
		super(left, right);
	}

	protected int evaluate(int left, int right) {
		return left / right;
	}

	protected double evaluate(double left, double right) {
		return left / right;
	}
}
