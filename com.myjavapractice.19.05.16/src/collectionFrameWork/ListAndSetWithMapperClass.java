package collectionFrameWork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListAndSetWithMapperClass {
	public static List<String> getCreatedList() {
		List<String> li1 = new ArrayList<String>();
		li1.add("Ajay");
		li1.add("Bijay");
		li1.add("Sanjay");
		return li1;
	}
	
	public static Set<Integer> getCreatedSet() {
		Set<Integer> se1 = new HashSet<Integer>();
		se1.add(100);
		se1.add(101);
		return se1;
	}

}
