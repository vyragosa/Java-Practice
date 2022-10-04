package Ex4.Task2;

public interface MenClothing {
	default void dressMan(Clothes[] clothes) {
		System.out.println("Одеваем мужчину");
	}
}
