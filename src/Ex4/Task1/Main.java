package Ex4.Task1;

public class Main {
	public static void main(String[] args) {
		Season mySeason = Season.SPRING;
		switch (mySeason) {
			case WINTER -> System.out.println("Я люблю зиму");
			case SPRING -> System.out.println("Я люблю весну");
			case SUMMER -> System.out.println("Я люблю лето");
			case AUTUMN -> System.out.println("Я люблю осень");
		}
		for (Season season : Season.values()) {
			System.out.println(season.toString());
		}
	}


}
