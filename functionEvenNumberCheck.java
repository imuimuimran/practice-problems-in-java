import java.util.*;  
public class functionEvenNumberCheck {  
    public static int checkEvenNumber(int n) {

        
        if(n % 2 == 0) {
            System.out.println(n + " is an even number.");
        } else {
            System.out.println(n + " is not an even number.");
        }
       
        return n;
    }
    public static void main(String[] args)  {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter a Number: ");
        int n = scanner.nextInt(); 

        checkEvenNumber(n);

        scanner.close();
    }  
}  