package Practice15.Task2;


import javax.swing.*;
import java.awt.*;
import java.util.Locale;
import java.util.Objects;

class CountriesGUI extends JFrame {
	private JComboBox<Country> comboBox;
	private JLabel textInfo;
	private JPanel panelBox;
	private JPanel panelTextInfo;

	public CountriesGUI() {
		super("Страны");
		setLayout(new GridLayout(2, 1));
		setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panelBox = new JPanel();
		panelTextInfo = new JPanel();
		add(panelBox);
		add(panelTextInfo);

		panelBox.add(comboBox = new JComboBox<>(Country.values()));
		panelTextInfo.add(textInfo = new JLabel(""));

		comboBox.addActionListener(e -> textInfo.setText("Размер страны: " + String.format(Locale.US, "%,d",
				Country.valueOf(Objects.requireNonNull(((JComboBox<?>) e.getSource()).getSelectedItem()).toString()).getPopulation()) + " км^2"));
		setVisible(true);
	}
}