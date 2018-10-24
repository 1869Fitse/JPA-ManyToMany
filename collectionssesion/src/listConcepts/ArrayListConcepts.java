package listConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts {

	public static void main(String[] args) {
	

		ArrayList ar = new ArrayList();
		ar.add("Ali");
		ar.add("Fitsum");
		ar.add("Marcus");
		
		System.out.println(ar.size());
		
		
		ar.add("abel");
		ar.add("Jamila");
		ar.add("alex");
		
		System.out.println(ar.size());
		System.out.println(ar.get(3));
		
		//for(int i=0;i<ar.size(); i++) {
			
			  System.out.println(ar.get(5));
			  
			  ArrayList<Integer> ar2 = new ArrayList<Integer>();
			  ar2.add(1000);
			  ar2.add(2000);
			  ar2.add(1788);
			  
			  ArrayList<String> ar3 = new ArrayList<String>();
			  ar3.add("alex");
			  ar3.add("jackson");
			  ar3.add("selenium");
			  
			  for(int i=0; i<ar3.size(); i++){
				  
				  System.out.println(ar3.get(i)); 
				  
				  Employee e1 = new Employee("marcus",28,"BA");
				  Employee e2 = new Employee("Darcus",28,"QA");
			      Employee e3 = new Employee("Farcus",28,"CEO");
			      
			      ArrayList<Employee> ar4= new ArrayList<Employee>();
			      ar4.add(e1);
			      ar4.add(e2);
			      ar4.add(e3);
			      
			      Iterator<Employee> it = ar4.iterator();
			      while(it.hasNext()) {
			    	 Employee emp= it.next();
			    	 
			    	 System.out.println(emp.name);
			    	 
			    	 System.out.println(emp.age);
			    	 System.out.println(emp.dept);
			    	 
			    	 
			    	 
			    	 ArrayList<String> ar5 = new ArrayList<String>();
			    	 
			    	 ar5.add("FITSSUM");
			    	 ar5.add("ANDUALEM");
			    	 ar5.add("demissie");
			    	 
			    	 ArrayList<String> ar6 = new ArrayList<String>();
			    	 ar6.add("FITSSUM");
			    	 ar6.add("WANKSTA");
			    	 ar6.add("PAZTUZ");
			    	 
			    	
			    		 
			    	 
			    	 
			    	 ar5.retainAll(ar6);
			    	 for(int j=0; j<ar5.size();j++) {
			    		 System.out.println(ar5.get(j));
			    		 
			      }
			      
				  
			      }
			  }
	}
}
			  
	
		
		
	
	
	


