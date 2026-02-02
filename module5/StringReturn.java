public class StringReturn {

    public static void main(String[] args) {
        String message = getGreeting("Java");
        System.out.println(message);
    }

    public static String getGreeting(String name) {
        return "Welcome to " + name;
    }
}
