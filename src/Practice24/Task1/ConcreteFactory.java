package Practice24.Task1;

public class ConcreteFactory implements ComplexAbstractFactory {
	@Override
	public Complex createComplex() {
		return new Complex(0, 0);
	}

	@Override
	public Complex CreateComplex(int real, int image) {
		return new Complex(real, image);
	}
}