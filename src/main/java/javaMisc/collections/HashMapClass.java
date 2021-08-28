package javaMisc.collections;

import static org.testng.Assert.assertNotEquals;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapClass {

	/*
	 * Doesn't guarantee sequence
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("Name", "Himanshu");
		hm.put(null, "Null");
		hm.put(null, "NotNull");
		hm.put("lastName", "Arora");
		hm.put("lastName", "OverRide");		
		hm.put("Job", "KuchNi");
		System.out.println(hm);
		System.out.println(hm.get("Job"));
		hm.remove("Job");
		System.out.println(hm);

		//using set to get key value pairs
		Set s = hm.entrySet();
		////Iterator
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry mp = (Map.Entry) itr.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}


	}

}
