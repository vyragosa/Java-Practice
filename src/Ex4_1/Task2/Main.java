package Ex4_1.Task2;

class Main {
	public static void main(String[] args) {
		Phone phone1 = new Phone(7842, "iphone", 123);
		Phone phone2 = new Phone(7563, "samsung", 312.2);
		Phone phone3 = new Phone();
		System.out.println(phone1);
		System.out.println(phone2);
		System.out.println(phone3);
		phone1.receiveCall("Ваня");
		phone2.receiveCall("Саша");
		phone3.receiveCall("Петя");
		phone1.receiveCall("Ваня", 8445);
		phone2.receiveCall("Саша", 8646);
		phone3.receiveCall("Петя", 8764);
		phone1.sendMessage(6123, 817, 7821, 812, 8123, 1512, 18237);
	}


}
