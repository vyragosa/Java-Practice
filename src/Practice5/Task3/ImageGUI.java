package Practice5.Task3;

import javax.swing.*;

class ImageGUI extends JFrame{
	ImageGUI(String args) {
		super(args);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(640,680);
		setVisible(true);
		JLabel jLabel = new JLabel();
		ImageIcon imageIcon = new ImageIcon(args);
		jLabel.setIcon(imageIcon);
		add(jLabel);

	}
}
