package Practice31.Model.Menu;

public enum DrinkTypeEnum {
	BEER(.05, "Пиво", "0.5 литра"),
	WINE(.12, "Вино", "0.75 литра"),
	VODKA(.40, "Водка", "0.5 литра"),
	BRANDY(.40, "Бренди", "0.5 литра"),
	CHAMPAGNE(.12, "Шампанское", "0.75 литра"),
	WHISKEY(.40, "Виски", "0.5 литра"),
	TEQUILA(.40, "Текила", "0.5 литра"),
	RUM(.40, "Ром", "0.5 литра"),
	VERMUTH(.16, "Вермут", "0.5 литра"),
	LIQUOR(.20, "Ликер", "0.5 литра"),
	JAGERMEISTER(.35, "Ягермайстер", "0.5 литра"),
	JUICE(.0, "Сок", "0.5 литра"),
	COFFEE(.0, "Кофе", "0.5 литра"),
	GREEN_TEA(.0, "Зеленый чай", "0.5 литра"),
	BLACK_TEA(.0, "Черный чай", "0.5 литра"),
	MILK(.0, "Молоко", "0.5 литра"),
	WATER(.0, "Вода", "0.5 литра"),
	SODA(.0, "Сода", "0.5 литра");
	private final double defaultAlcoholVol;
	private final String name;
	private final String description;

	private DrinkTypeEnum(double defaultAlcoholVol, String name, String description) {
		this.defaultAlcoholVol = defaultAlcoholVol;
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getDefaultAlcoholVol() {
		return defaultAlcoholVol;
	}
}
