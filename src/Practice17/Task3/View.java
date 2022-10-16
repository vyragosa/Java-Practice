package Practice17.Task3;

import javax.swing.*;
import java.awt.*;


class View extends JFrame {


	private final JLabel label;
	private final JTextField text;
	private final JButton button;

	public View() {
		super("Draw GUI");
		setSize(200, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 1));
		add(button = new JButton("CLICK ME"), JLabel.CENTER);
		add(text = new JTextField("Example"), JLabel.CENTER);
		add(label = new JLabel("Enter text"), JLabel.CENTER);
		setVisible(true);
	}

	public void setLabelText(String str) {
		label.setText(str);
	}

	public String getInputText() {
		return text.getText();
	}

	public void addActionListener(AbstractAction e) {
		button.addActionListener(e);
	}
}