import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String special = "@#$%&*!";

        String allCharacters = upper + lower + numbers + special;

        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        String password = "";

        for(int i = 0; i < length; i++) {

            int index = random.nextInt(allCharacters.length());

            password = password + allCharacters.charAt(index);
        }

        System.out.println("Generated Password: " + password);

        sc.close();
    }
}