package Practice30.Viewer;

import Practice30.Model.Expressions.IllegalTableNumber;
import Practice30.Model.Menu.Item;
import Practice30.Model.Order.Order;
import Practice30.Model.OrderManager.InternetOrdersManager;
import Practice30.Model.OrderManager.TableOrdersManager;

import javax.swing.*;
import java.awt.*;

public class ReportGUI extends JFrame {
	private final JPanel main;
	private final JPanel panel;
	private final JButton exit;
	private final JButton confirm;
	private final JLabel tableOrders;
	private final JLabel internetOrders;

	public ReportGUI(JFrame prev, TableOrdersManager tm, InternetOrdersManager im) {
		setTitle("Отчет");
		setSize(550, 600);
		setResizable(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		main = new JPanel();
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		tableOrders = new JLabel("Заказы в ресторане");
		internetOrders = new JLabel("Заказы через интернет");
		exit = new JButton("Exit");
		confirm = new JButton("Ok");
		exit.setFont(new Font("Serif", Font.PLAIN, 14));
		confirm.setFont(new Font("Serif", Font.PLAIN, 14));
		tableOrders.setFont(new Font("Serif", Font.PLAIN, 18));
		internetOrders.setFont(new Font("Serif", Font.PLAIN, 18));

		panel.add(tableOrders);
		for (int i = 0; i < tm.ordersQuantity(); i++) {
			Order order;
			try {
				order = tm.getOrder(i);
			} catch (IllegalTableNumber e) {
				JOptionPane.showMessageDialog(getContentPane(), "Неверный номер стола");
				return;
			}
			if (order == null)
				continue;
			Item[] items = order.sortedItemsByCostDesc();
			if (items == null)
				continue;
			JLabel label = new JLabel("Заказ для стола: " + i + ":");
			label.setFont(new Font("Serif", Font.PLAIN, 16));
			panel.add(label);

			for (Item value : items) {
				JLabel item = new JLabel(value.toString());
				item.setFont(new Font("Serif", Font.PLAIN, 14));
				panel.add(item);
			}
			double total = order.costTotal();
			JLabel cost = new JLabel("Цена=" + total + "рублей");
			cost.setFont(new Font("Serif", Font.PLAIN, 14));
			panel.add(cost);
			JLabel cst = new JLabel("Заказчик:");
			cst.setFont(new Font("Serif", Font.PLAIN, 14));
			JLabel info = new JLabel(order.getCustomer().toString());
			info.setFont(new Font("Serif", Font.PLAIN, 14));
			panel.add(cst);
			panel.add(info);
		}

		panel.add(internetOrders);
		for (Order order : im.getOrders()) {
			Item[] items = order.sortedItemsByCostDesc();
			if (items == null)
				continue;
			JLabel label = new JLabel("Заказ из интернета:");
			label.setFont(new Font("Serif", Font.PLAIN, 16));
			panel.add(label);

			for (Item value : items) {
				JLabel item = new JLabel(value.toString());
				item.setFont(new Font("Serif", Font.PLAIN, 14));
				panel.add(item);
			}
			double total = order.costTotal();
			JLabel cost = new JLabel("Цена=" + total + "рублей");
			cost.setFont(new Font("Serif", Font.PLAIN, 14));
			panel.add(cost);
			JLabel cst = new JLabel("Заказчик:");
			cst.setFont(new Font("Serif", Font.PLAIN, 14));
			JLabel info = new JLabel(order.getCustomer().toString());
			info.setFont(new Font("Serif", Font.PLAIN, 14));
			panel.add(cst);
			panel.add(info);
		}

		main.add(panel);
		JScrollPane scrollPane = new JScrollPane(main, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setPreferredSize(new Dimension(500, 400));
		add(scrollPane);
		add(confirm);
		add(exit);

		confirm.addActionListener(e -> {
			setVisible(false);
			dispose();
			prev.setVisible(true);
		});
		exit.addActionListener(e -> System.exit(0));

		setLocationRelativeTo(null);
		setVisible(true);
	}
}
