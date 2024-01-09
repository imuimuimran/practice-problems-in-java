import java.util.*;

public class PrintTableofANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of N: ");
        int N = sc.nextInt();
        System.out.print("Enter Number of M: ");
        int M = sc.nextInt();

        for(int i = 1; i<= M; i++){
            System.out.println(N + " X " + i + " = " + i * N);
        }
    }
}