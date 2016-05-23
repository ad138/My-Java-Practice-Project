package constructor;

/**
 * @author user : Aparna 
 * Java Version : jdk1.8
 */

public class MyDetails {
	
	/**
	 * @param : name and age
	 * Description : Creating constructor passing by value
	 */
	int myAge;
	
	public MyDetails(String name) {
		System.out.println("My full Name is : " + name);
	}
	
	/**
	 * @param : string, int
	 * Description : Creating constructor passing by value
	 */
	public void set(int age) {
		 int myAge = age;
	}
	
	public int get(){
		System.out.println("My age is :" + myAge);
		return myAge;
	}

}
