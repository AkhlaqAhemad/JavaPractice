import java.util.Scanner;

public class CalcOp{
	public static void main(String[] args){
		System.out.println("Please enter value to perform operation 1: Add, 2: Sub, 3: Mul, 4: Div");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("please enter two value to perform operation");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		switch(num){
			case 1:
			System.out.println("Your Input : " + num1 +", "+ num2);
			System.out.println(num1 + num2);
			break;
			case 2:
			System.out.println("Your Input : " + num1 +", "+ num2);
			System.out.println("Your Answer  = " + (num1 - num2));
			break;
			case 3:
			System.out.println("Your Input : " + num1 +", "+ num2);
			System.out.println("Your Answer  = " + (num1 * num2));
			break;
			case 4:
			System.out.println("Your Input : " + num1 +", "+ num2);
			if (num2 == 0){
				System.out.println("Invalid input : number can not divisible by 0");
			}
			System.out.println("Your Input : " + num1 +", "+ num2);
			System.out.println("Your Answer  = " + (num1 / num2));
			break;
			default:
			System.out.println("Invalid Input");
		}
	}
}