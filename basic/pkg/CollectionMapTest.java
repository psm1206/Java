package pkg;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionMapTest {
// List(ArrayList), Set, Map(HashMap)
	public static void main(String[] args) {
		// key, value 쌍의 hashmap을 만듬. map만 put사용 나머지 두 개는 add
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		for(int i=0; i<10; i++) {
			
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("K-NAME", "kim"+i);
			map.put("K-AGE", "20"+i);
			list.add(map);
			
//			String name = map.get("K-NAME");
//			String age = map.get("K-AGE");
//			System.out.println(name + ", " + age);
		}
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i).get("K-NAME"));
			
		}
	}

}
