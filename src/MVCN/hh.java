package MVCN;
import java.util.HashMap;

public class hh {
	public static void main(String[]args) {
		HashMap<String , String> ca = new HashMap<String , String>();
		ca.put("England", "London");
	    ca.put("Germany", "Berlin");
	    ca.put("Norway", "Oslo");
	    ca.put("USA", "Washington DC");
	    System.out.println(ca.get("England"));
	}

}
