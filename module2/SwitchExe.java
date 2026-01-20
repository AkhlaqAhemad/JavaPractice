import java.util.Scanner;

public class SwitchExe{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice){
			case 1:
			System.out.println("Check balance");
			break;
			case 2:
			System.out.println("Deposit money");
			break;
			case 3:
			System.out.println("Exit");
			break;
		}
	}
}