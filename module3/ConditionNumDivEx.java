public class ConditionNumDivEx{
	public static void main(String[] args){
		int num = 30;
		if (num % 3 == 0 && num % 5 == 0){
			System.out.println("Number is divisible by '3' and '5' both");
		}
		else if (num % 3 == 0){
			System.out.println("Number is divisible by 3 only");
		}
		else if (num % 5 == 0){
			System.out.println("Number is divisible by 5 only");
		}
		else{
			System.out.println("Number is not divisible");
		}
		
	}
}