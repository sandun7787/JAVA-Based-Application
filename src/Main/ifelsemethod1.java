package Main;

public class ifelsemethod1 {
	static void my(int age) {
		
		if(age<18) {
			System.out.println("Access denied - You are not old enough!");
		}else {
			 System.out.println("Access granted - You are old enough!");
		}
		
	}
	
	public static void main(String[]args) {
		my(17);
	}

}
