package Practice24.Task2;

public interface AbstractChairFactory {
	VictorianChair createVictorianChair(int age);

	MagicChair createMagicChair();

	FunctionalChair createFunctionalChair();
}
