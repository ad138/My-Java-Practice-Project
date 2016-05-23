package exceptionHandeling;

public class MyOwnExceptionClass extends Exception {
	String exceptionMessage;
	int lineNumber;
	String className;
	
	public MyOwnExceptionClass(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}
	
	public MyOwnExceptionClass(int lineNumber, String className) {
		this.lineNumber = lineNumber;
		this.className = className;
	}
	public String getMessgae() {
		String errorMessage = "Insufficient Balance" ;
		return errorMessage;
		
	}
	

}
