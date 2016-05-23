package collectionFrameWork;

import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mapping { 
	
	//checking changes
	public static void main (String args[]) {
		Map<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(100, "Ram");
		m1.put(102, "sam");
		m1.put(103, "Hari");
		if(!m1.isEmpty()) {
			if(m1.containsKey(102)) {
				System.out.println("All values are" + m1);
				System.out.println("Value is" + m1.get(102));
			} else {
				System.out.println("Key is not there");
			}
		}
		//using keyset() and values()
		if(!m1.keySet().isEmpty()) {
			for(Integer itr : m1.keySet()) {
				System.out.println("All Keys are " + itr);
				
			}
		}
		if(!m1.values().isEmpty()) {
			for(String itr1 : m1.values()) {
				System.out.println("All Keys are " + itr1);
			}
	}
		executemap();
}
		public static void executemap() {
			Map<Integer,String> m1 = new HashMap<Integer,String>();
			int i = 100;
			List<String> list2 = ListAndSetWithMapperClass.getCreatedList();
				if(!list2.isEmpty()) {
					for(String str3 : list2) {
						m1.put(i, str3);
						i++;
						System.out.println("Emp Nameand IDs are " + m1);
					}
				}
				Set<Integer> id = ListAndSetWithMapperClass.getCreatedSet();
				List<String> names = ListAndSetWithMapperClass.getCreatedList();
				if(!id.isEmpty()) {
					for (Integer in1 : id) {
						if(m1.containsKey(id)) {
						names.add(m1.get(id));
						}
					}
				}
				if(!names.isEmpty()) {
						System.out.println("values are" + names);
				}
		}
}
