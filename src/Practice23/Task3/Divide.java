package Practice23.Task3;

public class Divide extends Operation {

	public Divide(TripleExpression left, TripleExpression right) {
		super(left, right);
	}

	protected int evaluate(int left, int right) {
		return left / right;
	}

}
