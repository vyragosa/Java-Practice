package Ex4.Task1;

enum Season {
	WINTER(-15),
	SPRING(10),
	SUMMER(30) {
		@Override
		public String getDescription() {
			return "Жаркое время года";
		}
	},

	AUTUMN(15);

	private final int temperature;

	Season(int temperature) {
		this.temperature = temperature;
	}

	public String getDescription() {
		return "Холодное время года";
	}

	@Override
	public String toString() {
		return name() + "{temperature: " + temperature + ", description: " + getDescription() + "}";
	}
}
