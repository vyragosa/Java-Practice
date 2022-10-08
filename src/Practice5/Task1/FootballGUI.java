package Practice5.Task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class FootballGUI extends JFrame {

	private JLabel lastScorer;
	private JLabel result;
	private JLabel winner;

	private JButton realMadridButton;
	private JButton ACMilanButton;
	private JPanel buttonPanel;
	private JPanel labelPanel;
	private int realMadridScore = 0;
	private int ACMilanScore = 0;

	FootballGUI() {
		super("Real Madrid vs AC Milan");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 250);
		setVisible(true);
		add(buttonPanel = new JPanel());
		add(labelPanel = new JPanel());

		setLayout(new GridLayout(3, 1));
		buttonPanel.setLayout(new GridLayout(1, 2));
		labelPanel.setLayout(new GridLayout(1, 3));

		buttonPanel.add(realMadridButton = new JButton("Real Madrid"));
		buttonPanel.add(ACMilanButton = new JButton("AC Milan"));
		labelPanel.add(lastScorer = new JLabel("Last Scorer:", JLabel.CENTER));
		labelPanel.add(result = new JLabel("Result 0X0", JLabel.CENTER));
		labelPanel.add(winner = new JLabel("Winner: DRAW", JLabel.CENTER));


		ACMilanButton.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ACMilanScore++;
				updateScore();
				updateWinner();
				updateLast("AC Milan");
			}
		});

		realMadridButton.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				realMadridScore++;
				updateScore();
				updateWinner();
				updateLast("Real Madrid");
			}
		});

	}


	private void updateScore() {
		result.setText("Result: " + ACMilanScore + "X" + realMadridScore);
	}

	private void updateWinner() {
		if (ACMilanScore > realMadridScore) {
			winner.setText("Winner: AC Milan");
		} else if (ACMilanScore == realMadridScore) {
			winner.setText("Winner: DRAW");
		} else {
			winner.setText("Winner: Real Madrid");
		}
	}

	private void updateLast(String last) {
		lastScorer.setText("Last Scorer " + last);
	}

}
