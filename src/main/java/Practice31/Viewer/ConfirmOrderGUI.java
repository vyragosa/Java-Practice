package Practice31.Viewer;

import Practice31.Model.CustomerInfo.Customer;
import Practice31.Model.Expressions.IllegalTableNumber;
import Practice31.Model.Menu.Item;
import Practice31.Model.Order.InternetOrder;
import Practice31.Model.Order.Order;
import Practice31.Model.OrderManager.InternetOrdersManager;
import Practice31.Model.OrderManager.TableOrdersManager;

import javax.swing.*;
import java.awt.*;


public class ConfirmOrderGUI extends JFrame {
	private final JLabel label;
	private final JCheckBox[] items;
	private final JButton back;
	private final JButton cancel;
	private final JButton confirm;

	public ConfirmOrderGUI(Order order, JFrame prev, Customer customer, int tableNum, TableOrdersManager tm, InternetOrdersManager im) {
		setTitle("Ваш заказ");
		setSize(580, 600);
		setResizable(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		label = new JLabel("Ваш заказ");
		label.setFont(new Font("Serif", Font.PLAIN, 20));

		Item[] menu = order.sortedItemsByCostDesc();
		items = new JCheckBox[menu.length];

		confirm = new JButton("Confirm Order");
		back = new JButton("Back");
		cancel = new JButton("Cancel order");
		confirm.setFont(new Font("Serif", Font.PLAIN, 14));
		back.setFont(new Font("Serif", Font.PLAIN, 14));
		cancel.setFont(new Font("Serif", Font.PLAIN, 14));
		add(label);

		JPanel main = new JPanel();
		JPanel card = new JPanel();
		card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
		for (int i = 0; i < menu.length; i++) {
			items[i] = new JCheckBox(menu[i].toString());
			items[i].setFont(new Font("Serif", Font.PLAIN, 14));
			card.add(items[i]);
		}
		main.add(card);
		JScrollPane scrollPane = new JScrollPane(main, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setPreferredSize(new Dimension(500, 400));
		add(scrollPane);
		add(back);
		add(confirm);
		add(cancel);

		confirm.addActionListener(e -> {
			if (order instanceof InternetOrder) {
				im.add(order);
			} else {
				try {
					tm.add(order, tableNum);
				} catch (IllegalTableNumber ex) {
					JOptionPane.showMessageDialog(getContentPane(), "Неверный номер стола");
					return;
				}
			}
			setVisible(false);
			dispose();
			new ChooseNewOrCloseGUI(customer, tm, im).setVisible(true);
		});


		back.addActionListener(e -> {
			order.clear();
			prev.setVisible(true);
			setVisible(false);
			dispose();
		});
		cancel.addActionListener(e -> {
			order.clear();
			setVisible(false);
			dispose();
			JOptionPane.showMessageDialog(getContentPane(), "Заказ отменен");
			new ChooseNewOrCloseGUI(customer, tm, im).setVisible(true);
		});
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
