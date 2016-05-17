/**
 * 
 */
package ArrayListAndLists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author user
 *
 */
public class ArrayListClass {
	
	//Lets see if this works

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] stringArray = new String[20];
		//stringArray[21] = "Test";
		System.out.println("stringArray value at 21"+stringArray);
		Set<String> nonduplicateValuesSet = new HashSet<String>();
		
		ArrayList<String> arrayL = new ArrayList<String>();//creating arraylist
		System.out.println("Array value"+arrayL);
		arrayL.add("Saroj");
		
		arrayL.add("Bijay");
		arrayL.add("Aparna");
		System.out.println("Array After adding the values"+arrayL.get(2));
		
		List<String> arrayLst = new ArrayList<String>();//creating arraylist
		arrayLst.add("Sanjay");
		arrayLst.add("Bijay");
		arrayL.addAll(arrayLst);
		System.out.println("Array value afetr add all with duplicate values "+arrayL);
		//To remove the duplicate values in a list add it to set
		nonduplicateValuesSet.addAll(arrayL);
		System.out.println("Array value afetr add all with non-duplicate values "+nonduplicateValuesSet);
		
		
		if(!arrayL.isEmpty()) {
			for(int i=0;i<=arrayL.size() -1;i++) {
				if(arrayL.get(i) != null) {
					System.out.println("Array value afetr add all "+arrayL.get(i));
					System.out.println("Array value afetr add all "+i);
				}
			}
		}
		arrayL.remove("Bijay");
		System.out.println("Array value afetr remove "+arrayL);
		arrayL.removeAll(arrayLst);
		System.out.println("Array value afetr remove all "+arrayL);
	}

}
