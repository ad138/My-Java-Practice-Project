package collectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Iterator;

public class ArrayListClass {
	public static void main(String args[]) {
		Student s1 = new Student(101,"Aparna",25);
		Student s2 = new Student(102,"Bijay",29);
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Aparna");
		al.add("Bijay");
		al.add("Raj");
		al.add("Simran");
		System.out.println("Team size " + al.size());
		/*Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		for(String a1 : al) {
		System.out.println(a1);
		}
//============Adding student type argument==========================
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(s1);
		st.add(s2);
		for(Student st1 : st) {
			System.out.println(st1.age+" " + st1.name+" " +  st1.rollno);
		}
//====================Adding  one more arraylist====================
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Ram");
		al2.add("Hari");
		al.addAll(al2);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
		System.out.println("after adding " + itr.next());
		}
		al.removeAll(al2);
		Iterator itr1 = al.iterator();
			while(itr1.hasNext()) {
				System.out.println("after removing " + itr1.next());
			}
		}
	}