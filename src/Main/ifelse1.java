package Main;

public class ifelse1 {
	static  void myMethod(int age) {
		
		if(age<20) {
			System.out.println("Access denied - You are not old enough!");
			
		}else {
				System.out.println("Access granted - You are old enough!");
				
			
		}
	}

	public static void main(String[]args) {
		myMethod(25);
	}
}
