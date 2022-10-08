package Practice4_1.Task9;

public class FurnitureShop {
	private final Furniture[] furniture;

	public FurnitureShop() {
		this.furniture = new Furniture[]{
				new Sofa("Диван 1"),
				new Table("Стол 1"),
				new Chair("Стул 1"),
				new Sofa("Диван 2"),
				new Table("Стол 2"),
				new Chair("Стул 2"),
		};
	}

	public void build() {
		for (Furniture furniture1 : furniture) {
			System.out.println(furniture1);
		}
	}
}
