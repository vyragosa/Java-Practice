package Practice6.Task13;

class MyStringBuilder {

	private Observer onChangeListener;
	private StringBuilder stringBuilder;

	public MyStringBuilder() {
		this.onChangeListener = new Listener();
		this.stringBuilder = new StringBuilder();
	}

	private void notifyChange() {
		onChangeListener.handleEvent(this);
	}

	public MyStringBuilder append(Object obj) {
		stringBuilder.append(obj);
		notifyChange();
		return this;
	}

	public MyStringBuilder replace(int start, int end, String str) {
		stringBuilder.replace(start, end, str);
		notifyChange();
		return this;
	}

	public MyStringBuilder insert(int index, char[] str, int offset, int len) {
		stringBuilder.insert(index, str, offset, len);
		notifyChange();
		return this;
	}

	@Override
	public String toString() {
		return stringBuilder.toString();
	}
}