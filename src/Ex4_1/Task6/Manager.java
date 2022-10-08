package Ex4_1.Task6;

class Manager extends Employer {
	private final double averageSum;

	public Manager(String firstName, String lastName, double income, double averageSum) {
		super(firstName, lastName, income);
		this.averageSum = averageSum;
	}

	@Override
	public double getIncome() {
		return super.getIncome() + averageSum;
	}
}
