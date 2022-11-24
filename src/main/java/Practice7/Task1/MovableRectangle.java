package Practice7.Task1;

class MovableRectangle implements Movable {

	@Override
	public void moveUp() {
		System.out.println("Прямоугольник движется вверх");
	}

	@Override
	public void moveDown() {
		System.out.println("Прямоугольник движется вниз");
	}

	@Override
	public void moveLeft() {
		System.out.println("Прямоугольник движется влево");
	}

	@Override
	public void moveRight() {
		System.out.println("Прямоугольник движется вправо");
	}
}
