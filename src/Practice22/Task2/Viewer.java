package Practice22.Task2;

import javax.swing.*;


public class Viewer extends JFrame {
	private final JTextField textField;
	private final JButton buttonDeleteAll;
	private final JButton buttonDegree;
	private final JButton buttonDivide;
	private final JButton buttonSeven;
	private final JButton buttonEight;
	private final JButton buttonNine;
	private final JButton buttonMultiply;
	private final JButton buttonFour;
	private final JButton buttonFive;
	private final JButton buttonSix;
	private final JButton buttonSubtract;
	private final JButton buttonOne;
	private final JButton buttonTwo;
	private final JButton buttonThree;
	private final JButton buttonAdd;
	private final JButton buttonZero;
	private final JButton buttonDot;
	private final JButton buttonEqual;
	private final JButton buttonRoot;
	private final JPanel panelMain;

	Viewer() {
		super("Калькулятор");
		setSize(200, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(panelMain = new JPanel());
		panelMain.add(textField = new JTextField(16));
		panelMain.add(buttonAdd = new JButton("+"));
		panelMain.add(buttonOne = new JButton("1"));
		panelMain.add(buttonTwo = new JButton("2"));
		panelMain.add(buttonThree = new JButton("3"));
		panelMain.add(buttonSubtract = new JButton("-"));
		panelMain.add(buttonFour = new JButton("4"));
		panelMain.add(buttonFive = new JButton("5"));
		panelMain.add(buttonSix = new JButton("6"));
		panelMain.add(buttonMultiply = new JButton("*"));
		panelMain.add(buttonSeven = new JButton("7"));
		panelMain.add(buttonEight = new JButton("8"));
		panelMain.add(buttonNine = new JButton("9"));
		panelMain.add(buttonDivide = new JButton("/"));
		panelMain.add(buttonDegree = new JButton("^"));
		panelMain.add(buttonZero = new JButton("0"));
		panelMain.add(buttonRoot = new JButton("[ ]"));
		panelMain.add(buttonEqual = new JButton("="));
		panelMain.add(buttonDot = new JButton("."));
		panelMain.add(buttonDeleteAll = new JButton("C"));

		buttonDeleteAll.setActionCommand("DeleteAll");
		buttonDegree.setActionCommand("Degree");
		buttonRoot.setActionCommand("Space");
		buttonDivide.setActionCommand("Divide");
		buttonSeven.setActionCommand("Seven");
		buttonEight.setActionCommand("Eight");
		buttonNine.setActionCommand("Nine");
		buttonMultiply.setActionCommand("Multiply");
		buttonFour.setActionCommand("Four");
		buttonFive.setActionCommand("Five");
		buttonSix.setActionCommand("Six");
		buttonSubtract.setActionCommand("Subtract");
		buttonOne.setActionCommand("One");
		buttonTwo.setActionCommand("Two");
		buttonThree.setActionCommand("Three");
		buttonAdd.setActionCommand("Add");
		buttonZero.setActionCommand("Zero");
		buttonDot.setActionCommand("Dot");
		buttonEqual.setActionCommand("Equal");
		setVisible(true);

	}

	public void update(String text) {
		textField.setText(text);
	}

	public void errorMessage(String message) {
		JOptionPane.showMessageDialog(getContentPane(), message, "Ошибка", JOptionPane.ERROR_MESSAGE);
	}

	public void addActionListener(AbstractAction e) {
		buttonDeleteAll.addActionListener(e);
		buttonDegree.addActionListener(e);
		buttonDivide.addActionListener(e);
		buttonSeven.addActionListener(e);
		buttonEight.addActionListener(e);
		buttonNine.addActionListener(e);
		buttonMultiply.addActionListener(e);
		buttonFour.addActionListener(e);
		buttonFive.addActionListener(e);
		buttonSix.addActionListener(e);
		buttonSubtract.addActionListener(e);
		buttonOne.addActionListener(e);
		buttonTwo.addActionListener(e);
		buttonThree.addActionListener(e);
		buttonAdd.addActionListener(e);
		buttonZero.addActionListener(e);
		buttonDot.addActionListener(e);
		buttonEqual.addActionListener(e);
		buttonRoot.addActionListener(e);
	}
}
