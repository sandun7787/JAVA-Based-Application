package MVCN;

public class nb  extends  Thread{
public static void main(String []args) {
	nb thread = new nb();
	thread.start();
	System.out.println("This code is outside of the thread");
}
public void run() {
	System.out.println("This code is running in a thread");
}
}
