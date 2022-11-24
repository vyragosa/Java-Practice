package Practice30.Viewer;


import Practice30.Model.CustomerInfo.Address;
import Practice30.Model.CustomerInfo.Customer;
import Practice30.Model.Database.RestaurantInfo;
import Practice30.Model.Order.InternetOrder;
import Practice30.Model.Order.TableOrder;
import Practice30.Model.OrderManager.InternetOrdersManager;
import Practice30.Model.OrderManager.TableOrdersManager;

import javax.swing.*;
import java.awt.*;

public class OrderChooseGUI extends JFrame {
	private final JButton internetOrder;
	private final JButton tableOrder;
	private final JButton back;
	private final JLabel choose;

	public OrderChooseGUI(JFrame prev, Customer customer, TableOrdersManager tm, InternetOrdersManager im) {
		setTitle("Выбор режима заказа");
		setSize(160, 200);
		setResizable(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		choose = new JLabel("Выберете режим заказа:");
		internetOrder = new JButton("Заказ через интернет");
		tableOrder = new JButton("Заказ в ресторане");
		back = new JButton("Назад");

		choose.setFont(new Font("Serif", Font.PLAIN, 16));
		internetOrder.setFont(new Font("Serif", Font.PLAIN, 14));
		tableOrder.setFont(new Font("Serif", Font.PLAIN, 14));
		back.setFont(new Font("Serif", Font.PLAIN, 14));

		add(choose);
		add(internetOrder);
		add(tableOrder);
		add(back);

		internetOrder.addActionListener(e -> {
			if (customer.getAddress() == Address.getEmptyAddress()) {
				JOptionPane.showMessageDialog(getContentPane(), "Заказ через интернет невозможен, так как не указан адрес клиента");
				setVisible(false);
				dispose();
				prev.setVisible(true);
			} else {
				new OrderManagerGUI(OrderChooseGUI.this, customer, tm, im, new InternetOrder()).setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		tableOrder.addActionListener(e -> {
			new OrderManagerGUI(this, customer, tm, im, new TableOrder(RestaurantInfo.tableSize)).setVisible(true);
			setVisible(false);
			dispose();
		});

		back.addActionListener(e -> {
			setVisible(false);
			dispose();
			prev.setVisible(true);
		});
		setLocationRelativeTo(null);
	}
}
