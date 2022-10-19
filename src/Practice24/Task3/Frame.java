package Practice24.Task3;

import javax.swing.*;

class Frame extends JFrame {
	private JMenu file;
	private JMenuItem fileNew;
	private JMenuItem fileOpen;
	private JMenuItem save;
	private JMenuItem exit;
	private JMenuBar menuBar;

	public Frame(ICreateDocument createDocument) {
		super("Редактор");
		setSize(200, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setJMenuBar(menuBar = new JMenuBar());
		menuBar.add(file = new JMenu("Файл"));
		file.add(fileNew = new JMenuItem("Новый"));
		file.add(fileOpen = new JMenuItem("Открыть"));
		file.add(save = new JMenuItem("Сохранить"));
		file.add(exit = new JMenuItem("Выйти"));

		fileOpen.addActionListener(e -> createDocument.createOpen());
		fileNew.addActionListener(e -> createDocument.createNew());

		setVisible(true);
	}


}
