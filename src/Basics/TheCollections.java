package Basics;

import java.util.ArrayList;
import java.util.Collections;

public class TheCollections {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Rama");
		arr.add("RAJA");
		arr.add("HELOW");
		arr.add("12");
		int index = 0;
		System.out.println(arr.listIterator(index));
		
		System.out.println(arr.size());
		System.out.println("Below is the results of enhanced forr loop ");
		for(String i:arr) {
			System.out.print(i);
			
		}
		Collections.sort(arr);
		System.out.println(arr);
		
		

	}

}
