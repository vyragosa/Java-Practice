package Practice6.Task12;

import java.util.Stack;

class MyStringBuilder {


	private final StringBuilder stringBuilder;
	private final Stack<Action> actions;

	public MyStringBuilder() {
		this.stringBuilder = new StringBuilder();
		this.actions = new Stack<>();
	}

	public void undo() {
		if (!actions.isEmpty()) {
			actions.pop().undo();
		}
	}

	public MyStringBuilder reverse() {
		stringBuilder.reverse();
		actions.add(() -> stringBuilder.reverse());
		return this;
	}


	public MyStringBuilder append(String str) {
		stringBuilder.append(str);
		actions.add(() -> stringBuilder.delete(stringBuilder.length() - str.length() - 1, stringBuilder.length()));
		return this;
	}


	public MyStringBuilder appendCodePoint(int codePoint) {
		int lengthBefore = stringBuilder.length();
		stringBuilder.appendCodePoint(codePoint);
		actions.add(() -> stringBuilder.delete(lengthBefore, stringBuilder.length()));
		return this;
	}

	public MyStringBuilder delete(int start, int end) {
		String deleted = stringBuilder.substring(start, end);
		stringBuilder.delete(start, end);
		actions.add(() -> stringBuilder.insert(start, deleted));
		return this;
	}

	public MyStringBuilder deleteCharAt(int index) {
		char deleted = stringBuilder.charAt(index);
		stringBuilder.deleteCharAt(index);
		actions.add(() -> stringBuilder.insert(index, deleted));
		return this;
	}

	public MyStringBuilder replace(int start, int end, String str) {
		String deleted = stringBuilder.substring(start, end);
		stringBuilder.replace(start, end, str);
		actions.add(() -> stringBuilder.replace(start, end, deleted));
		return this;
	}

	public MyStringBuilder insert(int index, char[] str, int offset, int len) {
		stringBuilder.insert(index, str, offset, len);
		actions.add(() -> stringBuilder.delete(index, len));
		return this;
	}

	public MyStringBuilder insert(int offset, String str) {
		stringBuilder.insert(offset, str);
		actions.add(() -> stringBuilder.delete(offset, str.length()));
		return this;
	}

	@Override
	public String toString() {
		return stringBuilder.toString();
	}
}