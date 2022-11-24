package Practice4.Task2;

class Main {
	public static void main(String[] args) {
		Clothes[] clothes = {
				new TShirt(ClothingSize.XS, 120, "Синий"),
				new Pants(ClothingSize.M, 350, "Белый"),
				new Skirt(ClothingSize.M, 500, "Красный"),
				new Tie(ClothingSize.L, 100, "Черный")
		};
		Atelier atelier = new Atelier();
		atelier.dressWoman(clothes);
		atelier.dressMan(clothes);
	}
}
