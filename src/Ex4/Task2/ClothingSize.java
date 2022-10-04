package Ex4.Task2;

public enum ClothingSize {
	XXS(32) {
		@Override
		public String getDescription() {
			return "Детский размер";
		}
	},
	XS(34),
	S(36),
	M(38),
	L(40);

	ClothingSize(int euroSize) {
		
	}

	public String getDescription() {
		return "Взрослый размер";
	}
}