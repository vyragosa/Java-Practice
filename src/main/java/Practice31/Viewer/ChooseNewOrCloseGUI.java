package Practice31.Viewer;

import Practice31.Model.CustomerInfo.Customer;
import Practice31.Model.OrderManager.InternetOrdersManager;
import Practice31.Model.OrderManager.TableOrdersManager;

import javax.swing.*;
import java.awt.*;

public class ChooseNewOrCloseGUI extends JFrame {
	private final JButton newOrder;
	private final JButton exit;
	private final JButton report;
	private final JLabel label;

	public ChooseNewOrCloseGUI(Customer customer, TableOrdersManager tm, InternetOrdersManager im) {
		setTitle("Новый заказ?");
		setSize(240, 170);
		setResizable(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		label = new JLabel("Вы хотите сделать новый заказ?");
		newOrder = new JButton("Новый заказ");
		exit = new JButton("Выход");
		report = new JButton("Посмотреть все заказы");
		label.setFont(new Font("Serif", Font.PLAIN, 16));
		newOrder.setFont(new Font("Serif", Font.PLAIN, 14));
		exit.setFont(new Font("Serif", Font.PLAIN, 14));
		report.setFont(new Font("Serif", Font.PLAIN, 14));
		add(label);
		add(newOrder);
		add(report);
		add(exit);
		newOrder.addActionListener(e -> {
			setVisible(false);
			dispose();
			if (JOptionPane.showConfirmDialog(null,
					"Вы хотите создать нового покупателя?", "Новый покупатель?",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				new CustomerFillGUI(tm, im).setVisible(true);
			}
			else {
				new OrderChooseGUI(ChooseNewOrCloseGUI.this, customer, tm, im).setVisible(true);
			}
		});
		exit.addActionListener(e -> System.exit(0));
		report.addActionListener(e -> {
			setVisible(false);
			dispose();
			new ReportGUI(this,tm,im).setVisible(true);
		});
		setLocationRelativeTo(null);
	}
}
