import java.util.Scanner;  
public class patternHollowRhombus {  
    public static void main(String[] args)  {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the number of row: ");  
        int row = scanner.nextInt();
        
        /*
        The pattern looks like the below:
            *****
           *   *
          *   *
         *   *
        *****
        */ 
        
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= row - i; j++) {
                    System.out.print(" ");
            }
            for(int j = 1; j <= row; j++) {
                if(j == 1 || j == row || i == 1 || i == row) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }  
}  