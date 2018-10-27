package listConcepts;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//key value can not be null, if key value is duplicated it will return the last duplicated key value pair
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(1, "value");//adding key and value pair
		h1.put(3, "malue");
		h1.put(2, "salue");
		
		Hashtable<Integer, String> h = new Hashtable<Integer, String>();
		
		h= (Hashtable<Integer, String>)h1.clone();//cloning
		
		System.out.println(h1);
		System.out.println(h);
		
		h1.clear();
		
		System.out.println(h1);
		System.out.println(h);
		
		Hashtable<Integer, String> h3 = new Hashtable<Integer, String>();
		
		h3.put(1, "tom");//adding key and value pair
		h3.put(3, "tiera");
		h3.put(2, "sally");
		
		
		//contains 
		if(h3.contains("mlue")) {
			System.out.println("value is found");
		}else {
			System.out.println("value not found");
		}
		
		//iteration
		
		Enumeration<String> zz =h3.elements();
		
		while(zz.hasMoreElements()) {
			System.out.println(zz.nextElement());
			
		}
		
		//printing value using Entry
		
		Set<?> s= h3.entrySet();
		System.out.println(s);
		System.out.println(h3);
		
		//comparing two hashtables
		Hashtable<Integer, String> h4 = new Hashtable<Integer, String>();
		h4.put(1, "value");
		h4.put(3, "malue");
		h4.put(2, "salue");	
		
		if(h1.equals(h4))
			System.out.println(h1);
		
		Hashtable r1 = new Hashtable(); 
		Hashtable r2 = new Hashtable(); 
        r1.put(2, "Geeks"); 
        r1.put(2, "forGeeks"); 
        r1.put(1, "isBest"); 
           
           
        r2.put(3, "Geeks"); 
        r2.put(2, "forGeeks"); 
        r2.put(1, "isBest"); 
           
        System.out.println(r1);
        // checking whether both hash tables are equal or not 
        if (r2.equals(r2)) 
            System.out.println("both are equal"); 
        
        //find element by index
        System.out.println(r2.get(2));
        
        //get hash code
        System.out.println(r2.hashCode());
	}

}
