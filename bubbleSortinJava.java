import java.util.Scanner;

public class bubbleSortinJava {
    // Time Complexity = O(n^2)
    // Space Complexity = O(1)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Element: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        bubbleSort(arr, n);

        printArray(arr, n);

        scanner.close();
    }

    static void bubbleSort(int arr[], int n) {
        // Loop to access each array element
        for (int i = 0; i < n; i++) {
            // Loop to compare array elements
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

