package listConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListConcept {
	
	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<>();
		
		
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Marcus");
		ll.add("janet");
		ll.add("javier");
		ll.add("olympus");
		System.out.println(ll);
		ll.addFirst("Thomas");
		ll.addLast("allan");
		System.out.println(ll);
		System.out.println(ll.get(5));
		System.out.println(ll.get(0));
		ll.removeFirst();
		System.out.println(ll.get(0));
		ll.set(4, "element");
		ll.set(2, "element");
		System.out.println(ll);
		
		
		for (int n= 0;n<ll.size();n++ ) {
			System.out.println(ll.get(n));
			
			
			
			System.out.println("*******");
			
			
			for(String str :ll) {
				
				System.out.println(str);
				
				System.out.println("*******");
					
				
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("*******");
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
				
			}
			
			
			
		}
		
	}

}

