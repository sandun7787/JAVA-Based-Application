package MVCN;
import java.util.ArrayList;
import java.util.Iterator;

public class loop {
	public static void main(String[]args) {
		ArrayList<String> car = new ArrayList<String>();
		 car.add("Volvo");
		    car.add("BMW");
		    car.add("Ford");
		    car.add("Mazda");
		    
		    Iterator<String> it = car.iterator();
		    
		    while(it.hasNext()) {
		    	System.out.println(it.next());
		    }
	}

}
