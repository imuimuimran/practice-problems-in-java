import java.util.*;

public class SumofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 0; i<= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);

        sc.close();
    }
}