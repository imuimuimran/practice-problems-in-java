import java.util.*;  
public class functionPrintTableofANumber {  
    public static void printTable(int N, int M) {

        for(int i = 1; i<= M; i++){
            System.out.println(N + " X " + i + " = " + i * N);
        }
    }
    public static void main(String[] args)  {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter Number of N: ");
        int N = scanner.nextInt();
        System.out.print("Enter Number of M: ");
        int M = scanner.nextInt();

        printTable(N, M);
    }  
} 
