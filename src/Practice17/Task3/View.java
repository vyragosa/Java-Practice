package Practice17.Task3;

import javax.swing.*;
import java.awt.*;


class View extends JFrame {
	JPanel[] panel;
	private final JLabel label;
	private final JTextField text;
	private final JButton button;

	public View() {
		super("Draw GUI");
		setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 1));

		panel = new JPanel[3];
		for (int i = 0; i < panel.length; i++) {
			add(panel[i] = new JPanel());
		}
		panel[0].add(label = new JLabel("Enter text"), JLabel.CENTER);
		panel[1].add(text = new JTextField("Example", 16), JLabel.CENTER);
		panel[2].add(button = new JButton("CLICK ME"), JLabel.CENTER);
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