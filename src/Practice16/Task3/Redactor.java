package Practice16.Task3;

import javax.swing.*;
import java.awt.*;

class Redactor extends JFrame {
	private final JTextArea textArea;

	private final JMenuBar jMenuBar;
	private final JMenu jMenuColors;
	private final JMenu jMenuFonts;

	private final JMenuItem jMenuItemBlue;
	private final JMenuItem jMenuItemRed;
	private final JMenuItem jMenuItemBlack;

	private final JMenuItem jMenuItemTimes;
	private final JMenuItem jMenuItemSans;
	private final JMenuItem jMenuItemCourier;

	public Redactor() {
		super("Редактор");
		setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(textArea = new JTextArea());
		setJMenuBar(jMenuBar = new JMenuBar());

		jMenuBar.add(jMenuColors = new JMenu("Цвет"));
		jMenuBar.add(jMenuFonts = new JMenu("Шрифт"));

		jMenuColors.add(jMenuItemBlue = new JMenuItem("Blue"));
		jMenuColors.add(jMenuItemRed = new JMenuItem("Red"));
		jMenuColors.add(jMenuItemBlack = new JMenuItem("Black"));

		jMenuFonts.add(jMenuItemTimes = new JMenuItem("Times New Roman"));
		jMenuFonts.add(jMenuItemSans = new JMenuItem("MS Sans Serif"));
		jMenuFonts.add(jMenuItemCourier = new JMenuItem("Courier New"));

		jMenuItemRed.addActionListener(e -> textArea.setForeground(Color.RED));

		jMenuItemBlue.addActionListener(e -> textArea.setForeground(Color.blue));

		jMenuItemBlack.addActionListener(e -> textArea.setForeground(Color.black));

		jMenuItemTimes.addActionListener(e -> textArea.setFont(new Font(jMenuItemTimes.getText(), Font.BOLD, 14)));

		jMenuItemCourier.addActionListener(e -> textArea.setFont(new Font(jMenuItemCourier.getText(), Font.BOLD, 14)));

		jMenuItemSans.addActionListener(e -> textArea.setFont(new Font(jMenuItemSans.getText(), Font.BOLD, 14)));

		setVisible(true);
	}

}