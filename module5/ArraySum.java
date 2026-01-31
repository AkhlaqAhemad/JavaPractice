public class ArraySum {

    public static int sumOfArray(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int result = sumOfArray(numbers);
        System.out.println("Sum of array elements = " + result);
    }
}
