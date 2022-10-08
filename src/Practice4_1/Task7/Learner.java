package Practice4_1.Task7;

abstract class Learner {
	private final String name;

	public Learner(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "{" +
				"name='" + name + '\'' +
				'}';
	}
}
