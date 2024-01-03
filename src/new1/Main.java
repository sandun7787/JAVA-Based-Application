package new1;

abstract class Main {
	
	public String fname="johom";
	public int age= 24;
	public abstract void study();

}
abstract class Student  extends Main{
	public int graduationYear= 2018;
	public void study() {
		System.out.println("Studying all day long");
	}
	
}