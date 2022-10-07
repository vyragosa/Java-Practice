package Ex4.Task2;

class Pants extends Clothes implements MenClothing, WomenClothing {
	Pants(ClothingSize size, int cost, String color) {
		super(size, cost, color);
	}
}
