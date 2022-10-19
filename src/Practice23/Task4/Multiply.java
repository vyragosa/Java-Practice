package Practice23.Task4;

public class Multiply extends Operation {

	public Multiply(TripleExpression left, TripleExpression right) {
		super(left, right);
	}

	protected int evaluate(int left, int right) {
		return left * right;
	}

	protected double evaluate(double left, double right) {
		return left * right;
	}

}
