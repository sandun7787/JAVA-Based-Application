package Main;

public class Vehical {
	protected String brand ="Toyota";
	public void honk() {
		System.out.println("TUTU , tuuut");
	}

}

class car extends Vehical{
	private String modelName="Mustang";
public static void main(String []args) {

	car my = new car();
	my.honk();
	System.out.println(my.brand+""+my.modelName);

	
}

}
