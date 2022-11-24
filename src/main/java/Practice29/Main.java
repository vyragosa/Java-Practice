package Practice29;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IllegalTableNumber, OrderAlreadyAddedException {
		Item[] menu = new Item[] {
				new Drink("Водка", 100, "Водка 40%, 0.7л."),
				new Drink("Минеральная вода", 60, "Минеральная вода 0.5л."),
				new Drink("Кофе", 50, "Кофе 0.5л."),
				new Drink("Чай", 40, "Чай 0.5л."),
				new Dish("Салат", 100, "Салат из свежих овощей"),
				new Dish("Суп", 150, "Суп из свежих овощей"),
				new Dish("Гречка", 200, "Гречка с мясом"),
				new Dish("Картошка", 120, "Картошка с мясом"),
				new Dish("Котлета", 90, "Котлета с мясом"),
				new Dish("Пельмени", 150, "Пельмени с мясом"),
				new Dish("Рис", 200, "Рис с мясом"),
		};

		OrderManager manager = new OrderManager();
		manager.add("Иванов", new InternetOrder());
		manager.add("Петров", new RestaurantOrder(5));

		manager.add("Иванов", menu[0]);
		manager.add("Иванов", menu[1]);
		manager.add("Иванов", menu[2]);
		manager.add("Иванов", menu[3]);
		manager.add("Иванов", menu[4]);
		manager.add("Иванов", menu[5]);

		manager.add("Петров", menu[6]);
		manager.add("Петров", menu[7]);
		manager.add("Петров", menu[8]);
		manager.add("Петров", menu[9]);

		System.out.println(Arrays.toString(manager.getRestaurantOrders()));
		System.out.println(Arrays.toString(manager.getInternetOrders()));
		System.out.println(manager.internetQuantity());
		System.out.println(manager.internetQuantity("Чай"));
		System.out.println(manager.restaurantQuantity());
		System.out.println(manager.restaurantQuantity("Чай"));
	}
}
