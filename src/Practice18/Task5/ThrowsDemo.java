package Practice18.Task5;

public class ThrowsDemo {
	public void getDetails(String key) {
		//if(key == null) {
		//	throw new NullPointerException("null key in getDetails" );
		//}
		// do something with the key
		try {
			if (key == null) throw new NullPointerException("null key in getDetails");
		} catch (Exception err) {
			System.out.println(err.getMessage());
		}
	}
}