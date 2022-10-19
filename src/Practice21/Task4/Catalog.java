package Practice21.Task4;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

class Catalog {
	private static final ArrayList<String> catalog = new ArrayList<>();

	public static void makeCatalog(String path) {
		File[] files = new File(path).listFiles();
		for (File file : Objects.requireNonNull(files)) {
			if (file.isFile()) {
				catalog.add(file.getName());
			}
		}
	}

	public static void printCatalog() {
		for (int i = 0; i < 5; i++) {
			System.out.println(catalog.get(i));
		}
	}
}
