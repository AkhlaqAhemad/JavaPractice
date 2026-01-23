import java.util.Scanner;

public class CalOpEx{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please choice operation");
		int num = sc.nextInt();
		System.out.println("Please enter number to perform operation");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		switch (num){
			case 1:
			System.out.println("Addition");
			System.out.println(num1+num2);
			break;
			case 2:
			System.out.println("Sub");
			System.out.println(num1-num2);
			break;
			case 3:
			System.out.println("Multi");
			System.out.println(num1*num2);
			break;
			case 4:
			System.out.println("Div");
			System.out.println(num1/num2);
			break;
			default:
			System.out.println("Invalid choice");
		}
	}
}