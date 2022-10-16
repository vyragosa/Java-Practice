package Practice16.Task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

class Game extends JFrame {

	private final int number;
	private JPanel[] panel;
	private JButton answerButton;
	private JTextField textField;
	private JLabel labelAsk;
	private JLabel labelCounterAttemps;
	private int counter = 3;


	public Game() {
		super("Угадайка");
		number = new Random().nextInt(0, 21);
		setLayout(new GridLayout(4, 1));
		setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		labelAsk = new JLabel("Угадайте число между 0-20 ");
		labelCounterAttemps = new JLabel("У вас  осталось попыток 3 ");
		textField = new JTextField(4);
		answerButton = new JButton("Отправить ответ");
		panel = new JPanel[4];

		for (int i = 0; i < 4; i++) {
			add(panel[i] = new JPanel());
		}

		panel[0].add(labelAsk);
		panel[1].add(textField);
		panel[2].add(answerButton);
		panel[3].add(labelCounterAttemps);

		answerButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				counter--;
				if (textField.getText().equals(String.valueOf(number))) {
					labelCounterAttemps.setText("Верно. Вы победили. Игра окончена ");
					JOptionPane.showMessageDialog(null, "Верно. Вы победили. Игра окончена.");
				} else if (counter > 0) {
					labelCounterAttemps.setText("У вас  осталось попыток " + counter);
					if (Integer.parseInt(textField.getText()) < number) labelAsk.setText("Искомое число больше.");
					else labelAsk.setText("Искомое число меньше ");
				} else {
					labelCounterAttemps.setText("У вас не осталось попыток. Игра окончена ");
					JOptionPane.showMessageDialog(null, "У вас не осталось попыток. Игра окончена.");

				}
			}
		});
		setVisible(true);

	}
}