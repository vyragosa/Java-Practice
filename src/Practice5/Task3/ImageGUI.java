package Practice5.Task3;

import javax.swing.*;

class ImageGUI extends JFrame {
	ImageGUI(String args) {
		super(args);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel jLabel = new JLabel();
		ImageIcon imageIcon = new ImageIcon(args);
		setSize(imageIcon.getIconWidth(), imageIcon.getIconHeight());

		jLabel.setIcon(imageIcon);
		add(jLabel);
		setVisible(true);
	}
}
