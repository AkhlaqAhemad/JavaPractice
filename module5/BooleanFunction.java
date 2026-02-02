public class BooleanFunction {

    public static void main(String[] args) {
        int n = 10;

        if (isEven(n)) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
