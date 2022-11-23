package Practice30.Viewer;

import Practice30.Model.CustomerInfo.Customer;
import Practice30.Model.Database.Menu;
import Practice30.Model.Expressions.IllegalTableNumber;
import Practice30.Model.Order.InternetOrder;
import Practice30.Model.Order.Order;
import Practice30.Model.Order.TableOrder;
import Practice30.Model.OrderManager.TableOrdersManager;
import Practice30.Model.OrderManager.InternetOrdersManager;

import javax.swing.*;
import java.awt.*;


public class OrderManagerGUI extends JFrame {
	private final JPanel drinksPanel;
	private final JPanel drinksFrame;
	private final JPanel dishesPanel;
	private final JPanel dishesFrame;
	private final JLabel drinks;
	private final JLabel dishes;
	private final JRadioButton[] tables;
	private ButtonGroup tableButton;
	private final JTextField[] drinksField;
	private final JTextField[] dishesField;
	private final JButton confirm;
	private final JButton clear;
	private final JButton back;
	private final JScrollPane scrollPane;
	private JPanel tablesFrame;

	public OrderManagerGUI(JFrame prev, Customer customer, TableOrdersManager tm, InternetOrdersManager im, Order order) {
		order.setCustomer(customer);
		setTitle("Заказ в ресторане");
		setSize(1200, 600);
		setResizable(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		drinksField = new JTextField[Menu.drinks.length];
		dishesField = new JTextField[Menu.dishes.length];
		tables = new JRadioButton[5];
		confirm = new JButton("Подтвердить");
		clear = new JButton("Очистить");
		back = new JButton("Назад");
		drinks = new JLabel("Напитки:");
		dishes = new JLabel("Блюда:");
		confirm.setFont(new Font("Serif", Font.PLAIN, 14));
		clear.setFont(new Font("Serif", Font.PLAIN, 14));
		back.setFont(new Font("Serif", Font.PLAIN, 14));
		drinks.setFont(new Font("Serif", Font.PLAIN, 20));
		dishes.setFont(new Font("Serif", Font.PLAIN, 20));

		if (order instanceof TableOrder) {
			tablesFrame = new JPanel();
			tableButton = new ButtonGroup();
			tablesFrame.setLayout(new BoxLayout(tablesFrame, BoxLayout.Y_AXIS));
			for (int i = 0; i < tables.length; i++) {
				tables[i] = new JRadioButton("Столик №" + (i + 1));
				tables[i].setFont(new Font("Serif", Font.PLAIN, 14));
				tableButton.add(tables[i]);
				tablesFrame.add(tables[i]);
			}
			add(tablesFrame);
		}

		drinksPanel = new JPanel();
		scrollPane = new JScrollPane(drinksPanel, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setPreferredSize(new Dimension(500, 400));
		add(scrollPane);
		drinksFrame = new JPanel();
		drinksFrame.setLayout(new BoxLayout(drinksFrame, BoxLayout.Y_AXIS));
		drinksFrame.add(drinks);
		for (int i = 0; i < Menu.drinks.length; i++) {
			drinksField[i] = new JTextField();
			JLabel count = new JLabel(Menu.drinks[i].getName() + ":");
			count.setFont(new Font("Serif", Font.PLAIN, 20));
			drinksFrame.add(count);
			drinksFrame.add(drinksField[i]);
		}
		drinksPanel.add(drinksFrame);


		dishesPanel = new JPanel();
		dishesFrame = new JPanel();
		dishesFrame.setLayout(new BoxLayout(dishesFrame, BoxLayout.Y_AXIS));
		dishesFrame.add(dishes);
		for (int i = 0; i < Menu.dishes.length; i++) {
			dishesField[i] = new JTextField();
			JLabel count = new JLabel(Menu.dishes[i].getName() + ":");
			count.setFont(new Font("Serif", Font.PLAIN, 20));
			dishesFrame.add(count);
			dishesFrame.add(dishesField[i]);
		}


		dishesPanel.add(dishesFrame);
		JScrollPane scrollPane2 = new JScrollPane(dishesPanel, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane2.setPreferredSize(new Dimension(500, 400));
		add(scrollPane2);
		add(back);
		add(confirm);
		add(clear);


		confirm.addActionListener(e -> {
			for (int i = 0; i < Menu.drinks.length; i++) {
				if (drinksField[i].getText().equals(""))
					continue;
				if (Menu.drinks[i].isAlcoholicDrink() && customer.getAge() < 18) {
					drinksField[i].setText("");
					JOptionPane.showMessageDialog(getContentPane(), "Заказ алкоголя возможен только для совершеннолетних");
					return;
				}
				try {
					int positions = Integer.parseInt(drinksField[i].getText());
					for (int j = 0; j < positions; j++) {
						order.add(Menu.drinks[i]);
					}
				} catch (IllegalArgumentException | IllegalTableNumber ex) {
					JOptionPane.showMessageDialog(getContentPane(), "Неверный формат ввода");
					return;
				}
			}

			for (int i = 0; i < Menu.dishes.length; i++) {
				if (dishesField[i].getText().equals(""))
					continue;
				try {
					int positions = Integer.parseInt(dishesField[i].getText());
					for (int j = 0; j < positions; j++) {
						order.add(Menu.dishes[i]);
					}
				} catch (IllegalArgumentException | IllegalTableNumber ex) {
					JOptionPane.showMessageDialog(getContentPane(), "Поле блюд неправильно заполнено");
					return;
				}

			}

			if (order.itemsQuantity() == 0) {
				JOptionPane.showMessageDialog(getContentPane(), "Заказ пуст");
				return;
			}

			if (order instanceof InternetOrder) {
				new ConfirmOrderGUI(order,OrderManagerGUI.this, customer, 0, tm, im);
				setVisible(false);
				return;
			}

			int tableNumber = 0;
			for (int i = 0; i < tables.length; i++) {
				if (tables[i].isSelected()) {
					tableNumber = i + 1;
					break;
				}
			}
			if (tableNumber == 0) {
				JOptionPane.showMessageDialog(getContentPane(), "Выберите столик");
				return;
			}

			new ConfirmOrderGUI(order, OrderManagerGUI.this, customer, tableNumber, tm, im);
			setVisible(false);
			dispose();
		});
		clear.addActionListener(e -> {
			order.clear();
			for (int i = 0; i < Menu.drinks.length; i++) {
				drinksField[i].setText("");
			}
			for (int i = 0; i < Menu.dishes.length; i++) {
				dishesField[i].setText("");
			}

			if (order instanceof TableOrder) {
				for (JRadioButton jRadioButton : tables) {
					jRadioButton.setSelected(false);
				}
				tableButton.clearSelection();
			}


		});
		back.addActionListener(e -> {
			setVisible(false);
			dispose();
			prev.setVisible(true);
		});

		setLocationRelativeTo(null);

	}
}
