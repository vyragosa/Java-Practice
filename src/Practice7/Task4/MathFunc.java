package Practice7.Task4;

class MathFunc implements MathCalculable {
	@Override
	public double pow(double re, double im, int n) {
		double phi = Math.atan(re / im);
		return Math.pow(Math.sqrt(re * re + im * im), n) * Math.cos(n * phi) + -1 * Math.sin(n + phi);
	}

	@Override
	public double abs(double re, double im) {
		return Math.sqrt(re * re + im * im);
	}

	@Override
	public double getLength(double r) {
		return 2 * MathCalculable.PI * r;
	}
}
