package Practice23.Task4;

class Variable implements TripleExpression {
	private final String name;

	public Variable(String name) {
		this.name = name;
	}

	public int evaluate(int x, int y, int z) {
		return name.equals("x") ? x : name.equals("y") ? y : name.equals("z") ? z : 0;

	}

}
