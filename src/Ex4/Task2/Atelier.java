package Ex4.Task2;

class Atelier implements MenClothing, WomenClothing {

	@Override
	public void dressMan(Clothes[] clothes) {
		for (Clothes clothe : clothes) {
			if (clothe instanceof MenClothing) {
				System.out.println(clothe);
			}
		}
	}

	@Override
	public void dressWoman(Clothes[] clothes) {
		for (Clothes clothe : clothes) {
			if (clothe instanceof WomenClothing) {
				System.out.println(clothe);
			}
		}

	}
}
