import java.util.Scanner;

public class InputEx{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age and name");
		int age = sc.nextInt();
		
		String name =sc.nextLine();
		System.out.println(age+" "+name);
		
	}
}