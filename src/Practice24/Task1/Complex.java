package Practice24.Task1;

public class Complex {
	int real;
	int image;

	Complex(int real, int image) {
		this.real = real;
		this.image = image;
	}

	@Override
	public String toString() {
		return "Complex{" +
				"real=" + real +
				", image=" + image +
				'}';
	}
}
