package Practice7.Task6;

class ProcessStrings implements StringOperations {
	@Override
	public int getLength(String str) {
		return str.length();
	}

	@Override
	public String getOddString(String str) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 1; i < str.length(); i += 2) {
			stringBuilder.append(str.charAt(i));
		}
		return stringBuilder.toString();
	}

	@Override
	public String reverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}
}
