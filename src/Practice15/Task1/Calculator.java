package Practice15.Task1;

import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
	private final JPanel[] panel;
	private final JButton buttonAdd;
	private final JButton buttonSub;
	private final JButton buttonDiv;
	private final JButton buttonMul;
	private final JLabel labelFirstNumber;
	private final JLabel labelSecondNumber;
	private final JTextField textFirstNumber;
	private final JTextField textSecondNumber;

	public Calculator() {
		super("Калькулятор");
		setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 2));
		panel = new JPanel[8];
		labelFirstNumber = new JLabel("Первое число");
		labelSecondNumber = new JLabel("Второе число");
		textFirstNumber = new JTextField(4);
		textSecondNumber = new JTextField(4);
		buttonAdd = new JButton("+");
		buttonSub = new JButton("-");
		buttonDiv = new JButton("/");
		buttonMul = new JButton("*");
		for (int i = 0; i < 8; i++) {
			add(panel[i] = new JPanel());
		}
		panel[0].add(textFirstNumber);
		panel[1].add(textSecondNumber);
		panel[2].add(labelFirstNumber);
		panel[3].add(labelSecondNumber);
		panel[4].add(buttonAdd);
		panel[5].add(buttonDiv);
		panel[6].add(buttonSub);
		panel[7].add(buttonMul);

		buttonAdd.addActionListener(e -> {
			try {
				JOptionPane.showMessageDialog(null, (Double.parseDouble(textFirstNumber.getText()) + Double.parseDouble(textSecondNumber.getText())), "Результат сложения", JOptionPane.INFORMATION_MESSAGE);
				textFirstNumber.setText("");
				textSecondNumber.setText("");
			} catch (Exception exp) {
				JOptionPane.showMessageDialog(null, "NaN", "Ошибка", JOptionPane.ERROR_MESSAGE);
			}
		});

		buttonSub.addActionListener(e -> {
			try {
				JOptionPane.showMessageDialog(null, (Double.parseDouble(textFirstNumber.getText()) - Double.parseDouble(textSecondNumber.getText())), "Результат вычитания", JOptionPane.INFORMATION_MESSAGE);
				textFirstNumber.setText("");
				textSecondNumber.setText("");
			} catch (Exception exp) {
				JOptionPane.showMessageDialog(null, "NaN", "Ошибка", JOptionPane.ERROR_MESSAGE);
			}
		});

		buttonDiv.addActionListener(e -> {
			try {
				JOptionPane.showMessageDialog(null, (Double.parseDouble(textFirstNumber.getText()) / Double.parseDouble(textSecondNumber.getText())), "Результат деления", JOptionPane.INFORMATION_MESSAGE);
				textFirstNumber.setText("");
				textSecondNumber.setText("");
			} catch (Exception exp) {
				JOptionPane.showMessageDialog(null, "NaN", "Ошибка", JOptionPane.ERROR_MESSAGE);
			}
		});

		buttonMul.addActionListener(e -> {
			try {
				JOptionPane.showMessageDialog(null, (Double.parseDouble(textFirstNumber.getText()) * Double.parseDouble(textSecondNumber.getText())), "Результат умножения", JOptionPane.INFORMATION_MESSAGE);
				textFirstNumber.setText("");
				textSecondNumber.setText("");
			} catch (Exception exp) {
				JOptionPane.showMessageDialog(null, "NaN", "Ошибка", JOptionPane.ERROR_MESSAGE);
			}
		});

		setVisible(true);
	}
}
