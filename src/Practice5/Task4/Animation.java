package Practice5.Task4;

import javax.swing.*;
import java.util.Arrays;

class Animation extends JFrame {

	JLabel jLabel = new JLabel();

	private ImageIcon[] imageIcon;

	Animation(String args) {
		super("Animation");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 1100);
		setVisible(true);

		imageIcon = new ImageIcon[]{
				new ImageIcon(args),
				new ImageIcon("img_2.png"),
				new ImageIcon("img_3.png"),
				new ImageIcon("img_4.png"),
				new ImageIcon("img_5.png"),
		};
		ImageIcon imageIcon1 = new ImageIcon(args);
		jLabel.setIcon(imageIcon1);
		add(jLabel);

	}


}
