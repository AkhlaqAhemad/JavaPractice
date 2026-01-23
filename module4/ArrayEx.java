import java.util.Arrays;

public class ArrayEx{
	public static void main(String[] args){
		int[] num = {20,40,60,80,100};
		System.out.println("Array = "+Arrays.toString(num));               // to print whole array use java library name 'arrays'
		System.out.println("Array's First Element: "+num[0]);
		System.out.println("Array's Fifth Element: "+num[4]);              // to print last element by giving index no. 
		System.out.println("Array's Last Element: "+num[num.length - 1]);  // to print last element
	}
}