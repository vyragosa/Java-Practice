package Practice15.Task3;

import javax.swing.*;
import java.awt.*;

class MenuGUI extends JFrame {
	private final JPanel panelButton1;
	private final JPanel panelButton2;
	private final JPanel panelTextArea;
	private final JButton button1;
	private final JButton button2;
	private final JTextArea textArea;

	private final JMenuBar menuBar;
	private final JMenu menuFile;
	private final JMenuItem itemSave;
	private final JMenuItem itemExit;
	private final JMenu menuEdit;
	private final JMenuItem itemCopy;
	private final JMenuItem itemCut;
	private final JMenuItem itemPaste;
	private final JMenu menuHelp;

	public MenuGUI() {
		super("Меню");
		setSize(300, 300);
		setLayout(new GridLayout(2, 3));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panelButton1 = new JPanel();
		panelButton2 = new JPanel();
		panelTextArea = new JPanel();
		add(panelButton1);
		add(panelButton2);
		add(panelTextArea);
		panelButton1.add(button1 = new JButton("Button 1"));
		panelButton2.add(button2 = new JButton("Button 2"));
		panelTextArea.add(textArea = new JTextArea("Текст"));
		setJMenuBar(menuBar = new JMenuBar());
		menuBar.add(menuFile = new JMenu("File")).add(itemSave = new JMenuItem("Save"));
		menuFile.add(itemExit = new JMenuItem("Exit"));
		menuBar.add(menuEdit = new JMenu("Edit")).add(itemCopy = new JMenuItem("Copy"));
		menuEdit.add(itemCut = new JMenuItem("Cut"));
		menuEdit.add(itemPaste = new JMenuItem("Paste"));
		menuBar.add(menuHelp = new JMenu("Help"));
		setVisible(true);
	}


}
