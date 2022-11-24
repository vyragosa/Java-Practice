package Practice31.Model.Order;

import Practice31.Model.Expressions.IllegalTableNumber;
import Practice31.Model.Menu.Drink;
import Practice31.Model.Menu.DrinkTypeEnum;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InternetOrderTest {
	InternetOrder order;

	@BeforeEach
	void setUp() throws IllegalTableNumber {
		order = new InternetOrder();
		order.add(new Drink("Вода", 10, "Вода", DrinkTypeEnum.WATER));
		order.add(new Drink("Пиво", 20, "Пиво", DrinkTypeEnum.BEER));
		order.add(new Drink("Ликер", 30, "Ликер", DrinkTypeEnum.LIQUOR));
	}


	@org.junit.jupiter.api.Test
	void itemsQuantity() throws IllegalTableNumber {
		order.remove("Пиво");
		assertEquals(2, order.itemsQuantity());
	}

	@org.junit.jupiter.api.Test
	void sortedItemsByCostDesc() {
		assertEquals("Ликер", order.sortedItemsByCostDesc()[0].getName());
	}
}
