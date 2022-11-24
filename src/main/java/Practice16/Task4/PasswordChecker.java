package Practice16.Task4;

import javax.swing.*;
import java.awt.*;

class PasswordChecker extends JFrame {
	JLabel labelService;
	JTextField textFieldService;
	JLabel labelUserName;
	JTextField textFieldUserName;
	JLabel labelPassword;
	JTextField textPassword;

	JPanel[] panel;

	public PasswordChecker() {
		super("CheckingPassword");
		setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 1));

		panel = new JPanel[3];
		for (int i = 0; i < 3; i++) {
			add(panel[i] = new JPanel());
		}

		panel[0].add(labelService = new JLabel("Service: "));
		panel[0].add(textFieldService = new JTextField(16));

		panel[1].add(labelUserName = new JLabel("User name: "));
		panel[1].add(textFieldUserName = new JTextField(16));

		panel[2].add(labelPassword = new JLabel("Password: "));
		panel[2].add(textPassword = new JTextField(16));

		setVisible(true);
	}


}
