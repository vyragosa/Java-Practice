package Practice7.Task1;

interface Movable {
	default void moveUp() {
		System.out.println("Движение вверх");
	}

	default void moveDown() {
		System.out.println("Движение вниз");
	}

	default void moveLeft() {
		System.out.println("Движение влево");
	}

	default void moveRight() {
		System.out.println("Движение вправо");
	}
}
