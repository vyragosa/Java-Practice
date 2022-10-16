package Practice15.Task3;

import javax.swing.*;
import java.awt.*;

class MenuGUI extends JFrame {
	private JPanel panelButton1;
	private JPanel panelButton2;
	private JPanel panelTextArea;
	private JButton button1;
	private JButton button2;
	private JTextArea textArea;

	private JMenuBar menuBar;
	private JMenu menuFile;
	private JMenuItem itemSave;
	private JMenuItem itemExit;
	private JMenu menuEdit;
	private JMenuItem itemCopy;
	private JMenuItem itemCut;
	private JMenuItem itemPaste;
	private JMenu menuHelp;

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
