import java.util.*;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        
        int i;
        int m = 0;
        int flag = 0;

        m = n / 2;

        if(n == 0 || n == 1){
            System.out.println(n + " is not a prime number.");
        } else {
            for(i = 2; i <= m; i++){
                if(n % i == 0){
                    System.out.println(n + " is not a prime number.");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(n + " is a prime number.");
            }
        }

        sc.close();
    }
}