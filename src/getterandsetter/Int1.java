package getterandsetter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Int1 {
	public static void main(String[]args) {
		ArrayList<Integer> ca =  new ArrayList<Integer>();
		ca.add(67);
		ca.add(654);
		ca.add(54);
		ca.add(56887);
		Collections.sort(ca);
		
		for(int i :ca) {
			System.out.println(ca);
		}
		
	}
	
}
