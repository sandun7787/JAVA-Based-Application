package Main;

public final class par1 {
	int modelYear;
	String modelName;
	
	public par1(int year , String name) {
		modelYear= year;
		modelName=name;
		
	}
	
	public static void main(String []args) {
		par1 ne = new par1(1996 , "hashii");
		System.out.println(ne.modelYear+""+ne.modelName);
	}

}
