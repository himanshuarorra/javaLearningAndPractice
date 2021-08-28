package javaMisc.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
		//Initializing using add
		a.add("Himanshu");
		a.add("Arora");
		
		//Initializing using asList()
		ArrayList<String> b = new ArrayList<String>(
				Arrays.asList("Int","using","asList"));

		//Initializing List of method
		//		List<String> c = new ArrayList<String>(
		//				List.of("Int","using","asList"));

		System.out.println(a);

		//Add at index
		a.add(1,"Rewri");
		System.out.println(a);

		//Remove
		//a.remove(1);
		//By index
		//System.out.println(a);
		//By String
		//a.remove("Rewri");
		//System.out.println(a);

		//Remove ALL
		//a.removeAll(a);
		//System.out.println(a);

		//get element at index
		System.out.println(a.get(1));

		//check if present or not
		System.out.println(a.contains("Java"));

		//get the index of particular element
		System.out.println(a.indexOf("Arora"));

		//get size
		System.out.println(a.size());
		

		//Iterator
		Iterator<String> itr = a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
