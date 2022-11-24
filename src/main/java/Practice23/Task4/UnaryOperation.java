package Practice23.Task4;

public abstract class UnaryOperation implements TripleExpression {
	private final TripleExpression object;

	public UnaryOperation(TripleExpression object) {
		this.object = object;
	}

	abstract protected int evaluate(int object);

	public int evaluate(int x, int y, int z) {
		return evaluate(object.evaluate(x, y, z));
	}
}
