package Main;

public class Animal {
	public void animalSound() {
		System.out.println("ddd");
	}

}

class pig extends Animal{
	public void animalSound() {
		System.out.println("wweeee");
		
	}
}

class dog extends Animal{
	public void animalSound() {
		System.out.println("bow");
	}
}

class main{
	public static void main(String []args) {
		Animal my = new Animal();
		Animal my2 = new Animal();
		Animal  my3 = new Animal();
		
		my.animalSound();
		my2.animalSound();
		my3.animalSound();
	}
}


