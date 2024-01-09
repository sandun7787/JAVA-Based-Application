package MVCN;

public class try1 {
	public static void main(String []args) {
		try {
			int[] myNumber = {1,2,3,4,5,6,7,8,9};
			System.out.println(myNumber[10]);
		}catch(Exception e){
			System.out.println("Something went wrong");
		}finally{
			System.out.println("The 'try catch' is finished.");
			
		}
	}

}
