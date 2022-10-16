package Practice17.Task2;

class Main {
	public static void main(String[] args) {
		EmployeeController controller = new EmployeeController();
		retrieveDataFromDatabase(controller);
		controller.updateView();
	}

	public static void retrieveDataFromDatabase(EmployeeController controller) {
		controller.setName("Иван");
		controller.setWorkHours(69);
		controller.setCoefficient(13);

	}
}
