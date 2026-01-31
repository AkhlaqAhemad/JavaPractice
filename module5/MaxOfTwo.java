public class MaxOfTwo {

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        int result = max(15, 25);
        System.out.println("Maximum = " + result);
    }
}