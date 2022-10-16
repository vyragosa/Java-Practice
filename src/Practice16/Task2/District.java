package Practice16.Task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class District extends JFrame {
	private final JPanel center;
	private final JPanel west;
	private final JPanel east;
	private final JPanel south;
	private final JPanel north;

	public District() {
		super("Округи");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(center = new JPanel(), BorderLayout.CENTER);
		add(west = new JPanel(), BorderLayout.WEST);
		add(east = new JPanel(), BorderLayout.EAST);
		add(south = new JPanel(), BorderLayout.SOUTH);
		add(north = new JPanel(), BorderLayout.NORTH);

		center.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent event) {

				JOptionPane.showMessageDialog(getContentPane(), "Добро пожаловать в ЦАО", "Добро пожаловать в ЦАО", JOptionPane.PLAIN_MESSAGE);
			}
		});
		west.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent event) {

				JOptionPane.showMessageDialog(getContentPane(), "Добро пожаловать в ВАО", "Добро пожаловать в ВАО", JOptionPane.PLAIN_MESSAGE);

			}
		});

		south.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent event) {

				JOptionPane.showMessageDialog(getContentPane(), "Добро пожаловать в ЮАО", "Добро пожаловать в ЮАО", JOptionPane.PLAIN_MESSAGE);

			}
		});
		north.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent event) {
				JOptionPane.showMessageDialog(getContentPane(), "Добро пожаловать в САО", "Добро пожаловать в САО", JOptionPane.PLAIN_MESSAGE);
			}
		});
		east.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent event) {
				JOptionPane.showMessageDialog(getContentPane(), "Добро пожаловать в ЗАО", "Добро пожаловать в ЗАО", JOptionPane.PLAIN_MESSAGE);
			}
		});
		setVisible(true);
	}
}