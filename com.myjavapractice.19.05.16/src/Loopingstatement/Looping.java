package Loopingstatement;

public class Looping {
	int myAge;
	static int count;
	static int[] getElements() {
	int [] values = new int [3];
	values[0] = count++;
	values[1] = count++;
	values[2] = count++;
	return values;
	}
	public static void main (String args[]) { 
		//int [] values = {25, 65, 35, 45};
		//for (int value : values) {
			//System.out.println(value);
		for (int value : getElements()) {
			System.out.println(value);
		}
	}
}

