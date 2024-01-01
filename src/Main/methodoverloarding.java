package Main;

public class methodoverloarding {
	
	static int plusMethod(int x, int y) {
		return x*y;
	}
	
	static double plusMethod(double x, double y) {
		return x+y;
	}
	
	public static void main(String[]args) {
		int my =plusMethod(8, 5);
		double my2 = plusMethod(4.3, 6.26);
		System.out.println("int" + my);
		System.out.println("double" + my2);
	}

}
