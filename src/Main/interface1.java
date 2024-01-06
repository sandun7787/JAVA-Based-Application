package Main;

public interface interface1 {
	public void myMethod();

}

interface SecondInterface{
	public void myOtherMethod();
}

class DemoClass implements interface1,SecondInterface{
	public void myMethod() {
		System.out.print(false);
	}
	
	public void myOtherMethod() {
		System.out.println("jffjhj");
	}
}

class Main{
	public static void main(String [] args) {
		DemoClass myObj = new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();
	}
}