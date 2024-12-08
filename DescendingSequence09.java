import java.util.Scanner;
public class DescendingSequence09 {
    static void printDescendingRecursive(int n) {
        if (n < 0) {
            return; 
        }
        System.out.print(n + " "); 
        printDescendingRecursive(n - 1);
    }

    static void printDescendingIterative(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = input.nextInt();

        System.out.println("Using Recursive Function:");
        printDescendingRecursive(n); 
        System.out.println("\nUsing Iterative Function:");
        printDescendingIterative(n); 
    }
}
