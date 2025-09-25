package Level2.Task2;

import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String pwd = sc.nextLine();

        int length = pwd.length();
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for(int i=0; i<pwd.length(); i++) {
            char c = pwd.charAt(i);
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else hasSpecial = true;
        }

        int score = 0;

        if (length >= 12) score += 3;
        else if (length >= 10) score += 2;
        else if (length >= 8) score += 1;

        if (hasUpper) score += 1;
        if (hasLower) score += 1;
        if (hasDigit) score += 1;
        if (hasSpecial) score += 1;

        String strength;
        if (length == 0) {
            strength = "Empty";
        } else if (score <= 2) {
            strength = "Weak Password";
        } else if (score <= 4) {
            strength = "Moderate Password";
        } else if (score <= 6) {
            strength = "Strong Password";
        } else {
            strength = "Very Strong Password";
        }

        System.out.println("\nStrength: "+strength);
        System.out.println("Details:");
        System.out.println("- Length: "+length);
        System.out.println("- Contains uppercase: "+hasUpper);
        System.out.println("- Contains lowercase: "+hasLower);
        System.out.println("- Contains digit: "+hasDigit);
        System.out.println("- Contains special characters: "+hasSpecial);

        System.out.println("\nFeedback:");
        if (length < 8) {
            System.out.println("- Increase length to at least 8 characters.");
        } else if (length < 12) {
            System.out.println("- Consider using 12+ character for better security.");
        }
        if (!hasUpper) System.out.println("- Add uppercase letters (A-Z)");
        if (!hasLower) System.out.println("- Add lowercase letters (a-z)");
        if (!hasDigit) System.out.println("- Add digits (0-9)");
        if (!hasSpecial) System.out.println("- Add special characters (e.g., @ # $ % &)");

        if (strength.equals("Very Strong Password")) {
            System.out.println("- Good job! Your password meets strong criteria.");
        }
        sc.close();
    }
}