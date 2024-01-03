package Main;

public class myCar {
	public  void fullThrottle() {
		System.out.println("The car is going as fast as it can!");
		
	}
	
	public static  void  speed(int maxSpeed) {
		System.out.println("Max Speed is:"+ maxSpeed);
	}
	
	public static void main(String []args) {
		myCar my = new myCar();
		my.fullThrottle();
		my.speed(200);
	}

}
