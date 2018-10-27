package listConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterface {

	public static void main(String[] args) {
		 HashMap<Integer,String> hm = new HashMap<Integer,String>();
		 hm.put(1, "alex");
		 hm.put(4, "bonatan");
		 hm.put(67, "mark");
		 hm.put(45, "camerooon");
		 
		 
		 HashMap<Integer,String> Lm = new HashMap<Integer,String>();
		 Lm.put(11, "klex");
		 Lm.put(34, "jonatan");
		 Lm.put(77, "bark");
		 Lm.put(85, "zamerooon");
		 
		 hm.putAll(Lm);
		 
		 System.out.println(hm);
		 
		 for(Entry E : hm.entrySet()) {
			 
			 System.out.println(E.getKey() +"  " + E.getValue());
		 }
		 
		 
		 System.out.println(hm);
		 hm.remove(67);
		 System.out.println(hm);
		 
		 HashMap<Integer,Employee> emp = new HashMap<Integer, Employee>();
		 Employee e1 = new Employee("Tom", 25,"ceo");
		 Employee e2 = new Employee("Sam", 65,"cio");
		 Employee e3 = new Employee("Lam", 35,"coo");
		 emp.put(1, e1);
		 emp.put(2, e2);
		 emp.put(3, e3);
		 
		 for(Entry<Integer,Employee> C: emp.entrySet()) {
			  int key = C.getKey();
			  Employee e = C.getValue();
			 
			 System.out.println("Employee  " + key + "  Information" );
			System.out.println(e.name +" "+ e.age+ " "+ e.dept);
		 }
		 
	}

} 
