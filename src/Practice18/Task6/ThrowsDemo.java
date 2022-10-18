package Practice18.Task6;

class ThrowsDemo {
	public void printMessage(String key) {
		String message = getDetails(key);
		System.out.println(message);
	}

	public String getDetails(String key) {
		try {
			if (key == null) {
				throw new Exception("Key set to empty string");
			}
			return "data for " + key;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "";
		}
	}
}
