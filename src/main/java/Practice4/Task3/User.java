package Practice4.Task3;

enum User {
	LOGIN("admin"),
	PASSWORD("123123");
	private final String data;

	User(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}
}
