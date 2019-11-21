package pkg;

import java.util.HashMap;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("A08", "Dfdf");
		map.put("A09", "!!!!!");
		
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
			Object o = map.get(key);
			System.out.println(o.toString());
			//System.out.println(map.get(key));
		}
	}

}
