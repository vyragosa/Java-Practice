package Practice24.Task2;

class Client {
	private Chair chair;

	public void setChair(Chair chair) {
		this.chair = chair;
	}

	public void sit() {
		System.out.println("Сидит на стуле " + chair.getClass().getSimpleName());
	}
}
