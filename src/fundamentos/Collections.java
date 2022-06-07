package fundamentos;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Collections {
	
	public static void main(String[] args) {
		
		/** 
		 * 
		 * ArrayList or LinkedList instead of Vector
		 * Deque instead of Stack
		 * HashMap instead of Hashtable
		 * StringBuilder instead of StringBuffer
		 * 
		**/
		
		ArrayList<Object> listA = new ArrayList<>();
		listA.add("Edson");
		listA.add("Barbosa");
		listA.add("Junior");
		
		
		LinkedList<Object> listB = new LinkedList<>();
		listB.add(123);
		listB.add(456);
		listB.add(789);
		
		
		LinkedList<Object> listC = new LinkedList();
		listC.add(46.8);
		listC.add(123.49);
		listC.add(435.3);
		
				
		ArrayDeque<Long> listD = new ArrayDeque();
		listD.add(1_000_000_000L);
		listD.add(2_000_000_000L);
		listD.add(3_000_000_000L);
		
		
		for(int i = 0; i <= listA.size(); i++) {
			for(int j = 0; j <= listA.size(); j--) {
				
			}
			
		}
		

	}

}
