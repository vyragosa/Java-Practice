package Practice23.Task3;

class Const implements Expression {
	private final int iVal;
	private final double dVal;

	public Const(int value) {
		iVal = value;
		dVal = value;
	}

	public int evaluate(int x, int y, int z) {
		return iVal;
	}

}
