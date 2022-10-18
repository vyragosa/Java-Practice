package Practice19.Task2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


class LabClassUI extends JFrame {
	private final JPanel panelMain;
	private final JTable table;
	private final JMenuItem jMenuItemRemove;
	private final JMenuItem jMenuItemFind;
	private final JMenuItem jMenuItemAdd;
	ArrayList<Student> studentList;
	JMenuBar jMenuBar;

	public LabClassUI(ArrayList<Student> studentList) {
		super("Таблица учащихся");
		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.studentList = studentList;
		add(new JScrollPane(panelMain = new JPanel()));
		setJMenuBar(jMenuBar = new JMenuBar());
		jMenuBar.add(jMenuItemAdd = new JMenuItem("Добавить"));
		jMenuBar.add(jMenuItemRemove = new JMenuItem("Удалить"));
		jMenuBar.add(jMenuItemFind = new JMenuItem("Найти"));


		Object[][] array = new String[studentList.size()][6];
		for (int i = 0; i < studentList.size(); i++) {
			array[i][0] = studentList.get(i).getFirstName();
			array[i][1] = studentList.get(i).getSecondName();
			array[i][2] = studentList.get(i).getSpeciality();
			array[i][3] = String.valueOf(studentList.get(i).getCourse());
			array[i][4] = studentList.get(i).getGroup();
			array[i][5] = String.valueOf(studentList.get(i).getGPAScore());
		}
		table = new JTable(new DefaultTableModel(array, new String[]{"Имя", "Фамилия", "Специальность", "Курс", "Группа", "Балл"}));
		table.setAutoCreateRowSorter(true);
		add(new JScrollPane(table));

		jMenuItemAdd.addActionListener(e -> {
			try {
				addStudent();
			} catch (IllegalArgumentException exception) {
				JOptionPane.showMessageDialog(panelMain, exception.getMessage());
			}
		});

		jMenuItemRemove.addActionListener(e -> removeStudent());

		jMenuItemFind.addActionListener(e -> {
			try {
				findStudent();
			} catch (StudentNotFoundException ex) {
				JOptionPane.showMessageDialog(getContentPane(), ex.getMessage());
			}
		});


		setVisible(true);
	}


	private void findStudent() throws StudentNotFoundException {
		String s = JOptionPane.showInputDialog("Введите искомую Фамилию");
		for (Student student : studentList) {
			if (student.getSecondName().equals(s)) {
				JOptionPane.showMessageDialog(getContentPane(), "Студент нашелся: " + student);
				return;
			}
		}
		throw new StudentNotFoundException();
	}

	private void removeStudent() {
		if (table.getSelectedRowCount() != 1) {
			JOptionPane.showMessageDialog(getContentPane(), "Удалению подлежит только одна строка!");
			return;
		}
		int rowToDelete = table.getSelectedRow();
		studentList.remove(rowToDelete);
		((DefaultTableModel) table.getModel()).removeRow(rowToDelete);

	}

	private void addStudent() throws IllegalArgumentException {
		String firstName = JOptionPane.showInputDialog(getContentPane(), "Введите имя");
		if (firstName.equals(""))
			throw new EmptyStringException();
		String secondName = JOptionPane.showInputDialog(getContentPane(), "Введите фамилию");
		if (secondName.equals(""))
			throw new EmptyStringException();
		String speciality = JOptionPane.showInputDialog(getContentPane(), "Введите специальность");
		if (speciality.equals(""))
			throw new EmptyStringException();
		String group = JOptionPane.showInputDialog(getContentPane(), "Введите группу");
		if (group.equals(""))
			throw new EmptyStringException();
		String course = JOptionPane.showInputDialog(getContentPane(), "Введите курс");
		if (course.equals(""))
			throw new EmptyStringException();
		String GPAScore = JOptionPane.showInputDialog(getContentPane(), "Введите балл");
		if (GPAScore.equals(""))
			throw new EmptyStringException();

		try {
			studentList.add(new Student(firstName, secondName, speciality, Integer.parseInt(course), group, Integer.parseInt(GPAScore)));
			((DefaultTableModel) table.getModel()).addRow(new Object[]{firstName, secondName, speciality, Integer.parseInt(course), group, Integer.parseInt(GPAScore)});
			JOptionPane.showMessageDialog(getContentPane(), "Студент успешно добавлен!");
		} catch (NumberFormatException e) {
			throw new NumberFormatException("Ошибка перевода формата");
		}
	}

}
