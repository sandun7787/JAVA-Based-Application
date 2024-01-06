package Main;

public interface Animal1 {
	public void animalSound();
	public void sleep();

}


class Pig implements Animal{
	public void animalSound() {
		System.out.println("the pig says wee wee");
	}

	public void sleep() {
		System.out.println("zzzz");
	}
	
	class main {
		public  static void main(String [] args)
		{
			Pig mypig = new Pig();
			mypig.animalSound();
			mypig.sleep();}
		}
	
}