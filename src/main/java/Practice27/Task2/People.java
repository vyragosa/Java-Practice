package Practice27.Task2;

import java.util.HashMap;
import java.util.Map;

class People {
	private Map<String, String> map;

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public static HashMap<String, String> createMap() {
		HashMap<String, String> map = new HashMap<String, String>();
		for(int i = 0; i < 10; i++) {
			map.put("Name" + i, "Surname" + i);
		}
		return map;
	}

	public int getSameFirstNameCount(String name) {
		int count = 0;
		for(Map.Entry<String, String> pair : map.entrySet()) {
			if(pair.getKey().equals(name)) {
				count++;
			}
		}
		return count;
	}

	public int getSameLastNameCount(String lastName) {
		int count = 0;
		for(Map.Entry<String, String> pair : map.entrySet()) {
			if(pair.getValue().equals(lastName)) {
				count++;
			}
		}
		return count;
	}

	@Override
	public String toString() {
		return "People{" +
				"map=" + map +
				'}';
	}

}
