package Practice23.Task3;

class Variable implements Expression {
	private final String name;

	public Variable(String name) {
		this.name = name;
	}

	public int evaluate(int x, int y, int z) {
		return name.equals("x") ? x : name.equals("y") ? y : name.equals("z") ? z : 0;
	}

}
