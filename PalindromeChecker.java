import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String original = sc.nextLine();

        String reverse = "";

        for(int i = original.length() - 1; i >= 0; i--) {

            reverse = reverse + original.charAt(i);

        }

        if(original.equalsIgnoreCase(reverse)) {

            System.out.println("It is a Palindrome");

        } else {

            System.out.println("It is not a Palindrome");

        }

        sc.close();
    }
}