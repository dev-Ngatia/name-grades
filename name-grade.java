import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the full name of the student: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter the score: ");
        int score = scanner.nextInt();

        String grade;

        if (score >= 70) {
            grade = "A";
        } else if (score >= 60) {
            grade = "B";
        } else if (score >= 50) {
            grade = "C";
        } else if (score >= 40) {
            grade = "D";
        } else if (score > 40) {
            grade = "F";
        } else {
            grade = "Invalid Score";
        }

        System.out.println("Student: " + fullName + " Grade: " + grade);
    }
}
