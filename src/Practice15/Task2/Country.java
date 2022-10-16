package Practice15.Task2;

enum Country {
	Australia(7688000),
	China(9597000),
	England(243610),
	Russia(17100000);
	private final int population;

	Country(int population) {
		this.population = population;
	}

	public int getPopulation() {
		return population;
	}
}
