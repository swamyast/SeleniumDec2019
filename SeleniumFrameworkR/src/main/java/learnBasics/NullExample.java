package learnBasics;

public class NullExample {

	public static void main(String[] args) {
		// Null refers to classes or object not primitive types
		// int a=null;  gives an error
		String s=null;
		if(s==null) {
			System.out.println("s is null");
		}
		
		// below code will give null pointer exception
		if(s.equals(null)) {
			System.out.println("S is also null");
		}
	}
}
