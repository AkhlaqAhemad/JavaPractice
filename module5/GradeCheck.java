public class GradeCheck {

    static char calculateGrade(int marks) {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else if (marks >= 33) {
            return 'D';
        } else {
            return 'F'; // Fail
        }
    }

    public static void main(String[] args) {
        int marks = 82;
        char grade = calculateGrade(marks);
        System.out.println("Grade: " + grade);
    }
}
