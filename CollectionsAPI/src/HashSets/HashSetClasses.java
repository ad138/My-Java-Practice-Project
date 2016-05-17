/**
 * 
 */
package HashSets;

import java.util.HashSet;

/**
 * @author user
 *
 */
public class HashSetClasses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  HashSet<String> al = new HashSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");
		  System.out.println("Set of Strings"+al);
		  HashSet<Integer> a2 = new HashSet<Integer>();  
		  a2.add(11);  
		  a2.add(2);  
		  a2.add(3);  
		  a2.add(4);
		  if(!al.isEmpty() && al.size() >0) {
			  for(String str : al) {
				  System.out.println("Set of names"+str); 
			  }
		  }
		  HashSet<String> acloned = (HashSet<String>) al.clone();
		  System.out.println("Cloned Set "+acloned);
		  
		  System.out.println("Set of Integers"+a2);
		  a2.remove(11);
		  System.out.println("Set of Integersafter remobal"+a2);
		  a2.clear();
		  System.out.println("Clear Set"+a2);
	}

}
