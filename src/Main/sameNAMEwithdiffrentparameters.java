package Main;

public class sameNAMEwithdiffrentparameters {
	static int  plusMethodInt(int x, int y) {
		return x+y;
	}
	
	static double plusMethodDouble(double x ,double y) {
		return x+y;
	}
	
	public static void main(String [] args) {
		int my =plusMethodInt(8, 5);
		double my2=plusMethodDouble(4.3, 6.26);
		System.out.println("int" + my);
		System.out.println("double" + my2);
	}

}
