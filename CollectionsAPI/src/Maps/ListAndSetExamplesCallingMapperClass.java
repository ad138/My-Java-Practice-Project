package Maps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListAndSetExamplesCallingMapperClass {
	
	/*It creates a list 
	 * 
	 */
	public static List<String> getCreatedList() {
		List<String> arrayListExam = new ArrayList<String>();//creating arraylist    
		 arrayListExam.add("RaviX");//adding object in arraylist    
		 arrayListExam.add("VijayY");    
		 arrayListExam.add("SanjayZ");    
		 arrayListExam.add("AjayT");
		return arrayListExam;
	}
	
	/*It creates a list 
	 * 
	 */
	public static Set<Integer> getCreatedSet() {
		 Set<Integer> a2 = new HashSet<Integer>();  
		  a2.add(100);  
		  a2.add(101);  
		  a2.add(102);  
		  a2.add(444);
		return a2;
	}
}
