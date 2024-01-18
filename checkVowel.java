import java.util.Scanner;

public class checkVowel {
    // Function to check if a given letter is a vowel
    public static boolean isVowel(char letter) {
        // Convert the letter to lowercase for case-insensitive comparison
        char lowercaseLetter = Character.toLowerCase(letter);

        // Check if the lowercase letter is a vowel
        return lowercaseLetter == 'a' || lowercaseLetter == 'e' || lowercaseLetter == 'i'
                || lowercaseLetter == 'o' || lowercaseLetter == 'u';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char inputLetter = scanner.next().charAt(0);

        // Check if the entered letter is a vowel using the isVowel function
        if (isVowel(inputLetter)) {
            System.out.println("'" + inputLetter + "' is a vowel.");
        } else {
            System.out.println("'" + inputLetter + "' is not a vowel.");
        }

        scanner.close();
    }
}
