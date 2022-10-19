package Practice24.Task2;


class Main {
	public static void main(String[] args) {
		Client client = new Client();
		AbstractChairFactory factory = new ChairFactory();
		Chair chair = factory.createMagicChair();
		client.setChair(chair);
		client.sit();
	}
}
