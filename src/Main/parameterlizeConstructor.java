package Main;

public class parameterlizeConstructor {
	
	int x;

	public parameterlizeConstructor(int y) {
		x=y;
		
	}
	
	public static void main(String [] args) {
		parameterlizeConstructor my = new parameterlizeConstructor(5);
		System.out.println(my.x);
	}
}
