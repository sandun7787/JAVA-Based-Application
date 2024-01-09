package MVCN;
import java.util.Scanner;

public class mnb {
	public static void  main(String[]args) {
		int x,y,sum;
		Scanner my = new Scanner(System.in);
		System.out.println("Enter the number");
		
		x=my.nextInt();
		System.out.println("Type another number");
		y=my.nextInt();
		
		sum=x*y;
		System.out.println("එකතුව හුත්තෝ මේ"+sum);
	}
	

}
