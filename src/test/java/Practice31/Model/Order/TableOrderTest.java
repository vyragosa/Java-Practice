package Practice31.Model.Order;

import Practice31.Model.Expressions.IllegalTableNumber;
import Practice31.Model.Menu.Drink;
import Practice31.Model.Menu.DrinkTypeEnum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TableOrderTest {

	@Test
	void add() {
		TableOrder order = new TableOrder(3);
		try {
			order.add(new Drink("Вода", 30, "Вода", DrinkTypeEnum.WATER));
			order.add(new Drink("Пиво", 30, "Пиво", DrinkTypeEnum.BEER));
			order.add(new Drink("Ликер", 30, "Ликер", DrinkTypeEnum.LIQUOR));
		} catch (IllegalTableNumber e) {
			assertEquals("", e.getMessage());
		}

	}
}