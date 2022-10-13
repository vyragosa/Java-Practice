package Practice12.Task2;

import java.awt.*;
import java.util.Random;

class Square extends Shape {
	protected int side;

	public Square(Point point, int side, Color color, boolean filled) {
		super(point, color, filled);
		this.side = side;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Random random = new Random();
		if (filled)
			g.fillRect(random.nextInt(0, 40), random.nextInt(0, 40), side, side);
		else
			g.drawRect(random.nextInt(0, 40), random.nextInt(0, 40), side, side);
	}
}
