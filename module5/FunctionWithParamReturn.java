public class FunctionWithParamReturn{
	
	public static void main(String[] args){
	    String name = fullName("James", "Gosling");
	    System.out.println("Fullname = " +name);
	}

	public static String fullName(String first, String last) {
	    return first + " " + last;
	}
}