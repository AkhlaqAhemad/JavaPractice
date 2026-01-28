public class ResultCheck {

    static String checkPassFail(int marks) {
        if (marks >= 33) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        String result = checkPassFail(28);
        System.out.println("Result: " + result);
    }
}
