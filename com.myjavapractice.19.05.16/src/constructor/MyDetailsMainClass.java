package constructor;

public class MyDetailsMainClass {
	//Creating object to access the non static methods and vars 
	public static void main(String args[]) {
		MyDetails md = new MyDetails ("Aparna");
		md.myAge = 24;
		md.set(24);
		md.get();
		System.out.println("My age is " + md.myAge);
	}

}
