import java.util.*;  
public class calculator {  
    public static void main(String[] args)  {  
        Scanner sc= new Scanner(System.in);  
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter Operator: ");
        int operator = sc.nextInt();
        
        /**
        * 1 -> +
        * 2 -> -
        * 3 -> *
        * 4 -> /
        * 5 -> %
        */

        switch(operator) {
            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : if(b == 0) {
            System.out.println("Invalid Division");
            } else {
            System.out.println(a/b);
            }
            break;
            case 5 : if(b == 0) {
            System.out.println("Invalid Division");
            } else {
            System.out.println(a%b);
            }
            break;
            default : System.out.println("Invalid Operator");
        }  
        
        sc.close();
    }  
}  