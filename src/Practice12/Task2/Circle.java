package Practice12.Task2;

import java.awt.*;
import java.util.Random;

class Circle extends Shape {

	protected int radius;

	public Circle(Point point, int radius, Color color, boolean filled) {
		super(point, color, filled);
		this.radius = radius;
	}

	@Override
	public void paint(Graphics g) {
		Random random = new Random();
		super.paint(g);
		if (filled)
			g.fillOval(random.nextInt(0, 40), random.nextInt(0, 40), radius, radius);
		else
			g.drawOval(random.nextInt(0, 40), random.nextInt(0, 40), radius, radius);
	}
}
