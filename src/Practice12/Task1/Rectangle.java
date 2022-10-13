package Practice12.Task1;

import java.awt.*;
import java.util.Random;

class Rectangle extends Shape {
	protected int width;
	protected int length;

	public Rectangle(Point point, int width, int length, Color color, boolean filled) {
		super(point, color, filled);
		this.width = width;
		this.length = length;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Random random = new Random();
		if (filled)
			g.fillRect(random.nextInt(0, 40), random.nextInt(0, 40), width, length);
		else
			g.drawRect(random.nextInt(0, 40), random.nextInt(0, 40), width, length);
	}
}
