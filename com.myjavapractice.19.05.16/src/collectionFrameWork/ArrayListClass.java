package collectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Aparna");
		al.add("Bijay");
		al.add("Raj");
		al.add("Simran");
		System.out.println("Team size " + al.size());
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
