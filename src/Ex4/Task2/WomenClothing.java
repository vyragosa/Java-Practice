package Ex4.Task2;

public interface WomenClothing {
	default void dressWoman(Clothes[] clothes) {
		System.out.println("Одеваем женщину");
	}
}
