package Practice4.Task2;

interface MenClothing {
	default void dressMan(Clothes[] clothes) {
		System.out.println("Одеваем мужчину");
	}
}
