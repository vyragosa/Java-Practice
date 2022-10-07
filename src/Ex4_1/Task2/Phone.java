package Ex4_1.Task2;

public class Phone {
	private int number;
	private String model;
	private double weight;

	public void receiveCall(String name) {
		System.out.println("звонит " + name);
	}

	public void receiveCall(String name, int number) {
		System.out.println("звонит " + name + "с номера " + number);
	}

	Phone(int number, String model, double weight) {
		this(number, model);
		this.weight = weight;
	}
	Phone(int number, String model) {
		this.number = number;
		this.model = model;
	}

	Phone() {
		this.number = 7812;
		this.model = "huawei";
		this.weight = 74.4;
	}

	public int getNumber() {
		return number;
	}

	public void sendMessage(int... numbers) {
		for (int number : numbers) {
			System.out.println("Сообщение отправлено на номер " + number);
		}
	}


	@Override
	public String toString() {
		return "Phone{" +
				"number=" + number +
				", model='" + model + '\'' +
				", weight=" + weight +
				'}';
	}
}
