package Practice13.Task5;

class PhoneParser {
	String formatNumber;

	public PhoneParser(String number) {
		this.formatNumber = "%s-%s-%s".formatted(number.substring(0, number.length() - 7),
				number.substring(number.length() - 7, number.length() - 4),
				number.substring(number.length() - 4));
		if (number.charAt(0) != '+') this.formatNumber = "+" + formatNumber;

	}

	@Override
	public String toString() {
		return "PhoneParser{" +
				"formatNumber='" + formatNumber + '\'' +
				'}';
	}
}

