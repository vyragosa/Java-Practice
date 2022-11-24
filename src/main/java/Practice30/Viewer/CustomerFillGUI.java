package Practice30.Viewer;

import Practice30.Model.CustomerInfo.Address;
import Practice30.Model.CustomerInfo.Customer;
import Practice30.Model.OrderManager.TableOrdersManager;
import Practice30.Model.OrderManager.InternetOrdersManager;

import javax.swing.*;
import java.awt.*;

public class CustomerFillGUI extends JFrame {
	private Customer customer;
	private Address address;
	private final JTextField firstName;
	private final JTextField secondName;
	private final JTextField age;
	private final JLabel info;
	private final JLabel first;
	private final JLabel second;
	private final JLabel ageLabel;
	private final JLabel addressLabel;
	private final JLabel cityLabel;
	private final JLabel streetLabel;
	private final JLabel buildNumLabel;
	private final JLabel buildLetLabel;
	private final JLabel apartmentNumberLabel;
	private final JLabel zipCodeLabel;
	private final JTextField cityName;
	private final JTextField streetName;
	private final JTextField buildingNumber;
	private final JTextField buildingLetter;
	private final JTextField apartNumber;
	private final JTextField zipCode;
	private final JButton clearName;
	private final JButton clearAdd;
	private final JButton next;
	private final JPanel customerPanel;
	private final JPanel addressPanel;
	private final JPanel buttonPanel;

	public CustomerFillGUI(TableOrdersManager tm, InternetOrdersManager im) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Customer info");
		setSize(550, 350);
		setResizable(true);
		setLayout(new FlowLayout());
		cityName = new JTextField(15);
		streetName = new JTextField(15);
		buildingNumber = new JTextField(15);
		buildingLetter = new JTextField(15);
		apartNumber = new JTextField(15);
		zipCode = new JTextField(15);

		firstName = new JTextField(15);
		secondName = new JTextField(15);
		age = new JTextField(15);

		info = new JLabel("Информация о клиенте:");
		first = new JLabel("Имя:");
		second = new JLabel("Фамилия:");
		ageLabel = new JLabel("Возраст:");



		addressLabel = new JLabel("Адрес:");
		cityLabel = new JLabel("Город:");
		streetLabel = new JLabel("Улица:");
		buildNumLabel = new JLabel("Номер здания:");
		buildLetLabel = new JLabel("Корпус:");
		apartmentNumberLabel = new JLabel("Номер квартиры:");
		zipCodeLabel = new JLabel("Почтовый индекс:");
		clearName = new JButton("Очистить информацию о клиенте");
		clearAdd = new JButton("Очистить адрес");
		next = new JButton("Дальше");
		info.setFont(new Font("Serif", Font.PLAIN, 20));
		first.setFont(new Font("Serif", Font.PLAIN, 14));
		second.setFont(new Font("Serif", Font.PLAIN, 14));
		ageLabel.setFont(new Font("Serif", Font.PLAIN, 14));
		addressLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		cityLabel.setFont(new Font("Serif", Font.PLAIN, 14));
		streetLabel.setFont(new Font("Serif", Font.PLAIN, 14));
		buildNumLabel.setFont(new Font("Serif", Font.PLAIN, 14));
		buildLetLabel.setFont(new Font("Serif", Font.PLAIN, 14));
		apartmentNumberLabel.setFont(new Font("Serif", Font.PLAIN, 14));
		zipCodeLabel.setFont(new Font("Serif", Font.PLAIN, 14));
		clearName.setFont(new Font("Serif", Font.PLAIN, 14));
		clearAdd.setFont(new Font("Serif", Font.PLAIN, 14));
		next.setFont(new Font("Serif", Font.PLAIN, 14));
		customerPanel = new JPanel();
		customerPanel.setLayout(new BoxLayout(customerPanel, BoxLayout.Y_AXIS));
		addressPanel = new JPanel();
		addressPanel.setLayout(new BoxLayout(addressPanel, BoxLayout.Y_AXIS));
		buttonPanel = new JPanel();

		customerPanel.add(info);
		customerPanel.add(first);
		customerPanel.add(firstName);
		customerPanel.add(second);
		customerPanel.add(secondName);
		customerPanel.add(ageLabel);
		customerPanel.add(age);
		addressPanel.add(addressLabel);
		addressPanel.add(cityLabel);
		addressPanel.add(cityName);
		addressPanel.add(streetLabel);
		addressPanel.add(streetName);
		addressPanel.add(buildNumLabel);
		addressPanel.add(buildingNumber);
		addressPanel.add(buildLetLabel);
		addressPanel.add(buildingLetter);
		addressPanel.add(apartmentNumberLabel);
		addressPanel.add(apartNumber);
		addressPanel.add(zipCodeLabel);
		addressPanel.add(zipCode);
		buttonPanel.add(clearName);
		buttonPanel.add(clearAdd);
		buttonPanel.add(next);
		add(customerPanel);
		add(addressPanel);
		add(buttonPanel);
		clearName.addActionListener(e -> {
			firstName.setText("");
			secondName.setText("");
			age.setText("");
		});
		clearAdd.addActionListener(e -> {
			cityName.setText("");
			streetName.setText("");
			buildingNumber.setText("");
			buildingLetter.setText("");
			apartNumber.setText("");
			zipCode.setText("");
		});
		next.addActionListener(e -> {
			try {
				address = new Address(cityName.getText(),
						Integer.parseInt(zipCode.getText()),
						streetName.getText(),
						Integer.parseInt(buildingNumber.getText()),
						buildingLetter.getText().charAt(0),
						Integer.parseInt(apartNumber.getText()));

			} catch (IllegalArgumentException ex) {
				address = Address.getEmptyAddress();
			}
			try {
				customer = new Customer(firstName.getText(),
						secondName.getText(),
						Integer.parseInt(age.getText()),
						address);
			} catch (IllegalArgumentException ex1) {
				if (JOptionPane.showConfirmDialog(null,
						"Пользователь введен неверно. Вы хотите продолжить?", "Предупреждение",
						JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION)
					return;
				customer = Customer.getNotMatureUnknownCustomer();
			}
			new OrderChooseGUI(this, customer,tm,im).setVisible(true);
			dispose();
			setVisible(false);
		});
		setLocationRelativeTo(null);
	}
}
