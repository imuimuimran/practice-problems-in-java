import java.util.Scanner;

public class powerofTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPowerofTwo(number)) {
            System.out.println(number + " is a power of 2.");
        } else {
            System.out.println(number + " is not a power of 2.");
        }

        scanner.close();
    }

    static boolean isPowerofTwo(int num) {
        // A number is a power of 2 if it has only one bit set
        // So, checking if (num & (num - 1)) equals 0
        return num > 0 && (num & (num - 1)) == 0;
    }
}
