package Practice5.Task4;

import javax.swing.*;
import java.util.Objects;


class Animation extends JFrame {
	private final ImageIcon[] imageIcon = new ImageIcon[]{
			new ImageIcon(Objects.requireNonNull(getClass().getResource("img_1.png"))),
			new ImageIcon(Objects.requireNonNull(getClass().getResource("img_2.png"))),
			new ImageIcon(Objects.requireNonNull(getClass().getResource("img_3.png"))),
			new ImageIcon(Objects.requireNonNull(getClass().getResource("img_4.png"))),
			new ImageIcon(Objects.requireNonNull(getClass().getResource("img_5.png"))),
	};
	JLabel image;
	int iter;

	Animation() {
		super("Animation");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 1100);


		getContentPane().add(image = new JLabel(imageIcon[iter]));

		Timer timer = new Timer(200, e -> showImages());
		timer.start();

		setVisible(true);

	}

	private void showImages() {
		image.setIcon(imageIcon[iter]);
		if (iter == 4) iter = 0;
		else iter++;
	}

}
