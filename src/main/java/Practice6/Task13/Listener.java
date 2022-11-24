package Practice6.Task13;

class Listener implements Observer {
	public void handleEvent(MyStringBuilder stringBuilder) {
		System.out.println("Изменено: " + stringBuilder.toString());
	}
}