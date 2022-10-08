package Practice2.Task6;

class Circle {
	private double s;
	private double l;
	private double r;

	public Circle(double r) {
		this.r = r;
		setL();
		setS();
	}

	public double getP() {
		return r;
	}


	public void setR(double r) {
		this.r = r;
	}


	public double getS() {
		return s;
	}

	public void setS() {
		s = Math.PI * r * r;
	}


	public double getL() {
		return l;
	}

	public void setL() {
		l = 2 * Math.PI * r;
	}

	void compareCircle(Circle other) {
		if (this.s > other.getS())
			System.out.println("S bigger in first circle");
		else if (this.s < other.getS())
			System.out.println("S is bigger in second circle");
		else
			System.out.println("S is the same in circles");

		if (this.l > other.getL())
			System.out.println("L bigger in first circle");
		else if (this.l < other.getL())
			System.out.println("L is bigger in second circle");
		else
			System.out.println("L is the same in circles");
	}

	@Override
	public String toString() {
		return "Circle{r: " + r + ", s: " + s + ", l: " + l + "}";
	}
}
