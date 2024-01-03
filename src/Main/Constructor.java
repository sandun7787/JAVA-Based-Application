package Main;

public class Constructor {
	
int x;

public Constructor() {
	x=10;
}

public static void main(String []args) {
	Constructor my = new Constructor();
	System.out.println(my.x);
}
}
