import java.util.Scanner;

public class SwitchOp{
	public static void main(String[] args){
		System.out.println("Enter a number 1 for add and 2 for sub");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch (num){
			case 1:
			System.out.println("You select add operation, plz enter two number that you add");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println(num1+num2);
			break;
			case 2:
			System.out.println("You select sub operation, plz enter two number that you sub");
			int num3 = sc.nextInt();
			int num4 = sc.nextInt();
			System.out.println(num3-num4);

			break;
			default:
			System.out.println("Invalid Number");
		}
		
		
	}
}