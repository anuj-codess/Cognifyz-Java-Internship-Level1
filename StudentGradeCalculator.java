import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= subjects; i++) {

            System.out.print("Enter marks of subject " + i + ": ");
            int marks = sc.nextInt();

            sum = sum + marks;
        }

        double average = (double) sum / subjects;

        System.out.println("Average Marks: " + average);

        if(average >= 90) {

            System.out.println("Grade: A");

        }
        else if(average >= 75) {

            System.out.println("Grade: B");

        }
        else if(average >= 60) {

            System.out.println("Grade: C");

        }
        else {

            System.out.println("Grade: D");

        }

        sc.close();
    }
}