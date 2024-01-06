package Main;
import java.util.Scanner;

public class Multiplevalue {
	public static void main(String []args) {
		Scanner my = new Scanner(System.in);
		System.out.println("Enter name, age and salary:");
		
		String name = my.nextLine();
		
		int age = my.nextInt();
		double salary = my.nextDouble();
		
		System.out.println("Name :"+ name);
		System.out.println("Age :"+ age);
		System.out.println("Salary :"+ salary);
	}

}
