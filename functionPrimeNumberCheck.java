import java.util.*;  
public class functionPrimeNumberCheck {  
    public static int checkPrimeNumber(int n) {

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
       
        return n;
    }
    public static void main(String[] args)  {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter a Number: ");
        int n = scanner.nextInt(); 

        checkPrimeNumber(n);

        scanner.close();
    }  
} 
