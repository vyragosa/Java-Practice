package Ex4_1.Task6;

public class Main {
	public static void main(String[] args) {
		Employer[] worker = new Employer[]{
				new Manager("Андрей", "Петрович", 123.1, 13),
				new Employer("Иван", "Олегович", 144)
		};
		for (Employer salary : worker) {
			System.out.println(salary);
		}
	}
}
