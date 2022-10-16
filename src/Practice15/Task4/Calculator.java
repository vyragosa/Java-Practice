package Practice15.Task4;

import javax.swing.*;

class Calculator extends JFrame {

	private JButton buttonZero;
	private JButton buttonOne;
	private JButton buttonTwo;
	private JButton buttonThree;
	private JButton buttonFour;
	private JButton buttonFive;
	private JButton buttonSix;
	private JButton buttonSeven;
	private JButton buttonEight;
	private JButton buttonNine;
	private JButton buttonAdd;
	private JButton buttonSub;
	private JButton buttonDiv;
	private JButton buttonMul;

	private JButton buttonClear;
	private JButton buttonResult;
	private JPanel panelMain;
	private JTextField textField;

	Calculator() {
		super("Калькулятор");
		setSize(200, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(panelMain = new JPanel());
		panelMain.add(textField = new JTextField(16));
		panelMain.add(buttonAdd = new JButton("+"));
		panelMain.add(buttonOne = new JButton("1"));
		panelMain.add(buttonTwo = new JButton("2"));
		panelMain.add(buttonThree = new JButton("3"));
		panelMain.add(buttonSub = new JButton("-"));
		panelMain.add(buttonFour = new JButton("4"));
		panelMain.add(buttonFive = new JButton("5"));
		panelMain.add(buttonSix = new JButton("6"));
		panelMain.add(buttonMul = new JButton("*"));
		panelMain.add(buttonSeven = new JButton("7"));
		panelMain.add(buttonEight = new JButton("8"));
		panelMain.add(buttonNine = new JButton("9"));
		panelMain.add(buttonDiv = new JButton("/"));
		panelMain.add(buttonZero = new JButton("0"));
		panelMain.add(buttonClear = new JButton("C"));
		panelMain.add(buttonResult = new JButton("="));

		final double[] first = {0};
		final double[] second = {0};
		final String[] sign = {""};


		buttonZero.addActionListener(e -> {
			textField.setText(textField.getText() + 0);
			if (first[0] == 0) {
				first[0] = Double.parseDouble(textField.getText());
			} else {
				second[0] = Double.parseDouble(textField.getText());
			}
		});
		buttonOne.addActionListener(e -> {
			textField.setText(textField.getText() + 1);
			if (first[0] == 0) {
				first[0] = Double.parseDouble(textField.getText());
			} else {
				second[0] = Double.parseDouble(textField.getText());
			}
		});

		buttonTwo.addActionListener(e -> {
			textField.setText(textField.getText() + 2);
			if (first[0] == 0) {
				first[0] = Double.parseDouble(textField.getText());
			} else {
				second[0] = Double.parseDouble(textField.getText());
			}
		});

		buttonThree.addActionListener(e -> {
			textField.setText(textField.getText() + 3);
			if (first[0] == 0) {
				first[0] = Double.parseDouble(textField.getText());
			} else {
				second[0] = Double.parseDouble(textField.getText());
			}
		});

		buttonFour.addActionListener(e -> {
			textField.setText(textField.getText() + 4);
			if (first[0] == 0) {
				first[0] = Double.parseDouble(textField.getText());
			} else {
				second[0] = Double.parseDouble(textField.getText());
			}
		});

		buttonFive.addActionListener(e -> {
			textField.setText(textField.getText() + 5);
			if (first[0] == 0) {
				first[0] = Double.parseDouble(textField.getText());
			} else {
				second[0] = Double.parseDouble(textField.getText());
			}
		});

		buttonSix.addActionListener(e -> {
			textField.setText(textField.getText() + 6);
			if (first[0] == 0) {
				first[0] = Double.parseDouble(textField.getText());
			} else {
				second[0] = Double.parseDouble(textField.getText());
			}
		});

		buttonSeven.addActionListener(e -> {
			textField.setText(textField.getText() + 7);
			if (first[0] == 0) {
				first[0] = Double.parseDouble(textField.getText());
			} else {
				second[0] = Double.parseDouble(textField.getText());
			}
		});

		buttonEight.addActionListener(e -> {
			textField.setText(textField.getText() + 8);
			if (first[0] == 0) {
				first[0] = Double.parseDouble(textField.getText());
			} else {
				second[0] = Double.parseDouble(textField.getText());
			}
		});

		buttonNine.addActionListener(e -> {
			textField.setText(textField.getText() + 9);
			if (first[0] == 0) {
				first[0] = Double.parseDouble(textField.getText());
			} else {
				second[0] = Double.parseDouble(textField.getText());
			}
		});

		buttonOne.addActionListener(e -> {
			textField.setText(textField.getText() + 0);
			if (first[0] == 0) {
				first[0] = Double.parseDouble(textField.getText());
			} else {
				second[0] = Double.parseDouble(textField.getText());
			}
		});


		buttonAdd.addActionListener(e -> {
			first[0] = Double.parseDouble(textField.getText());
			textField.setText("");
			sign[0] = "+";
		});

		buttonSub.addActionListener(e -> {
			first[0] = Double.parseDouble(textField.getText());
			textField.setText("");
			sign[0] = "-";
		});

		buttonMul.addActionListener(e -> {
			first[0] = Double.parseDouble(textField.getText());
			textField.setText("");
			sign[0] = "*";
		});

		buttonDiv.addActionListener(e -> {
			first[0] = Double.parseDouble(textField.getText());
			textField.setText("");
			sign[0] = "/";
		});

		buttonResult.addActionListener(e -> {
			switch (sign[0]) {
				case "+" -> first[0] += second[0];
				case "-" -> first[0] -= second[0];
				case "*" -> first[0] *= second[0];
				case "/" -> first[0] /= second[0];
				default -> first[0] = 0;
			}
			textField.setText(String.valueOf(first[0]));
		});
		buttonClear.addActionListener(e -> {
			first[0] = 0;
			second[0] = 0;
			textField.setText("");
		});
		setVisible(true);
	}


}