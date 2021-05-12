package javaMisc.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	/*
	 * Doesn't accept duplicate elements
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet, TreeSet and LinkedHashSet
		/*
		 * No Guarantee that elements are stored in sequential order
		 */
		
		ArrayList<String> a = new ArrayList<String>();
		//Initializing using add
		a.add("Himanshu");
		a.add("Arora");
		a.add("Himanshu");
		a.add("Arora");
		System.out.println(a);
		
		HashSet<String> hs = new HashSet<String>();
		//Add an entire collection
		//here i'm adding a having duplicate elements
		hs.addAll(a);
		hs.add("Rewri");
		hs.remove("Himanshu");
		System.out.println(hs);
		System.out.println(hs.size());

		
		////Iterator
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			String it = itr.next();
			if(it.equals("Rewri")) {
				itr.remove();
			}
		}
		System.out.println(hs);


	}

}
