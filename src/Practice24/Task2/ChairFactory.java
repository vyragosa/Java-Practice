package Practice24.Task2;

class ChairFactory implements AbstractChairFactory {
	@Override
	public FunctionalChair createFunctionalChair() {
		return new FunctionalChair();
	}

	@Override
	public MagicChair createMagicChair() {
		return new MagicChair();
	}

	@Override
	public VictorianChair createVictorianChair(int age) {
		return new VictorianChair(age);
	}
}
