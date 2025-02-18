import java.util.Scanner;
import java.util.Random;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Step 1: Print initials I Y
        System.out.println("III III III      YYY   YYY");
        System.out.println("    III           YYY YYY ");
        System.out.println("    III             YYY ");
        System.out.println("    III             YYY ");
        System.out.println("    III             YYY ");
        System.out.println("III III III         YYY");
        // Step 2: Convert Fahrenheit to Celsius
        System.out.print("Enter Fahrenheit: ");
        int fahrenheit = scanner.nextInt();
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.println("Celsius: " + celsius);

        // Step 3: Process a 5-character string
        System.out.print("Enter a 5-character string: ");
        String str = scanner.next();
        if (str.length() == 5) {
            System.out.println("Processed String: " + str.charAt(3) + str.charAt(2) + str.charAt(1));
        }

        // Step 4: Generate a random number (32-16384)
        int randomNum = random.nextInt(16353) + 32;
        System.out.println("Random Number: " + randomNum);

        scanner.close();
    }
}