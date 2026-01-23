import java.util.Scanner;



public class InputStringOp{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();

		System.out.println(word);

		System.out.println(word.length());

		System.out.println(word.charAt(0));

		System.out.println(word.toUpperCase());

	}

}