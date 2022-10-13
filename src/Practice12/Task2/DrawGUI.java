package Practice12.Task2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class DrawGUI extends JFrame {
	public DrawGUI() {
		super("Draw GUI");
		setSize(650, 650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 5));

		Random random = new Random();
		for (int i = 0; i < 20; i++) {
			int x = random.nextInt(0, 3);
			if (x == 0)
				add(new Circle(new Point(random.nextInt(0, 100), random.nextInt(0, 100)),
						random.nextInt(50, 100),
						new Color(random.nextFloat(), random.nextFloat(), random.nextFloat()),
						random.nextInt(0, 10) > 5), JLayeredPane.POPUP_LAYER);
			else if (x == 1)
				add(new Rectangle(new Point(random.nextInt(0, 100), random.nextInt(0, 100)),
						random.nextInt(50, 100), random.nextInt(50, 100),
						new Color(random.nextFloat(), random.nextFloat(), random.nextFloat()),
						random.nextInt(0, 10) > 5), JLayeredPane.POPUP_LAYER);
			else
				add(new Square(new Point(random.nextInt(0, 100), random.nextInt(0, 100)),
						random.nextInt(50, 100),
						new Color(random.nextFloat(), random.nextFloat(), random.nextFloat()),
						random.nextInt(0, 10) > 5), JLayeredPane.POPUP_LAYER);
		}

		setVisible(true);
	}

}
