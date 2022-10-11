package Practice6.Task12;

public class Main {
	public static void main(String[] args) {
		MyStringBuilder stringBuilder = new MyStringBuilder();
		stringBuilder.append("123");
		stringBuilder.reverse();
		System.out.println(stringBuilder);
		stringBuilder.undo();
		System.out.println(stringBuilder);
	}
}
