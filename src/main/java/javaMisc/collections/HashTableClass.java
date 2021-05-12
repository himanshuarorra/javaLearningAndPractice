package javaMisc.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableClass {
	/*
	 * Doesn't guarantee sequence
	 */
	/*
	 * Hashtable is thread safe and synchronized as compared to HashMap
	 * Hashtable do not allow null value and null keys as object
	 * Hashtable is the only class other than vector which uses enumerator to iterat
	 * the values of hashtable
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<String,String> hm = new Hashtable<String,String>();
		hm.put("Name", "Himanshu");
		hm.put("lastName", "Arora");
		hm.put("Job", "null");
		System.out.println(hm);
		System.out.println(hm.get("Job"));
		hm.remove("Job");
		System.out.println(hm);

		/*
		//using set to get key value pairs
		Set s = hm.entrySet();
		////Iterator
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry mp = (Map.Entry) itr.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		*/


	}


}
