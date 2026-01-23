public class ArrayUpdateEx{
	public static void main(String[] args){
		int[] arr = {9,8,3,7,6,4};
		int search = 3;
		for (int i=0; i<arr.length; i++){
			if (arr[i] == search){
				System.out.println("Found: " +arr[i]);
			}
		}
		arr[2] = 1;
		System.out.println("Number updated successfully");
	}
}