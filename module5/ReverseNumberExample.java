public class ReverseNumberExample {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Reversed number = " + reverseNumber(n));
    }

    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + (num % 10);
            num = num / 10;
        }
        return reverse;
    }
}
