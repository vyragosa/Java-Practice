package Practice30.Model.Database;

import Practice30.Model.Menu.Dish;
import Practice30.Model.Menu.Drink;
import Practice30.Model.Menu.DrinkTypeEnum;

public final class Menu {
	public static Drink[] drinks = new Drink[] {
			new Drink(150, "Пиво", "0.5л", DrinkTypeEnum.BEER, 4.5),
			new Drink(200, "Вино", "0.7л",DrinkTypeEnum.WINE, 12.5),
			new Drink(250, "Водка", "0.5л",DrinkTypeEnum.VODKA, 40.5),
			new Drink(300, "Бренди", "0.7л",DrinkTypeEnum.BRANDY, 40.5),
			new Drink(350, "Шампанское", "0.7л",DrinkTypeEnum.CHAMPAGNE, 12.5),
			new Drink(400, "Виски", "0.7л",DrinkTypeEnum.WHISKEY, 40.5),
			new Drink(450, "Текила", "0.7л",DrinkTypeEnum.TEQUILA, 40.5),
			new Drink(500, "Ром", "0.7л",DrinkTypeEnum.RUM, 40.5),
			new Drink(550, "Вермут", "0.7л",DrinkTypeEnum.VERMUTH, 16.5),
			new Drink(600, "Ликер", "0.7л",DrinkTypeEnum.LIQUOR, 20.5),
			new Drink(650, "Ягерьмейстер", "0.3л",DrinkTypeEnum.JAGERMEISTER, 35.5),
			new Drink(700, "Сок", "0.33л",DrinkTypeEnum.JUICE, 0),
			new Drink(750, "Кофу", "0.2л",DrinkTypeEnum.COFFEE, 0),
			new Drink(800, "Зеленый чай", "0.2л",DrinkTypeEnum.GREEN_TEA, 0),
			new Drink(850, "Черный чай", "0.2л",DrinkTypeEnum.BLACK_TEA, 0),
			new Drink(900, "Молоко", "0.2л",DrinkTypeEnum.MILK, 0),
			new Drink(950, "Вода", "0.33л",DrinkTypeEnum.WATER, 0),
			new Drink(1000, "Газированная вода", "0.33л",DrinkTypeEnum.SODA, 0),
	};

	public static Dish[] dishes = new Dish[] {
			new Dish(100, "Борщ", "300г"),
			new Dish(200, "Солянка", "400г"),
			new Dish(300, "Котлета по-киевски", "200г"),
			new Dish(400, "Котлета по-московски", "200г"),
			new Dish(500, "Котлета по-донецки", "300г"),
			new Dish(600, "Котлета по-харьковски", "200г"),
			new Dish(700, "Котлета по-винницки", "400г"),
			new Dish(800, "Котлета по-одесски", "200г"),
	};
}
