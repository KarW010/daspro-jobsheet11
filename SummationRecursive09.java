import java.util.Scanner;
public class SummationRecursive09 {
    static int sumNumbersRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumNumbersRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = input.nextInt();

        int result = sumNumbersRecursive(n);
        System.out.println("Summation from 1 to " + n + " = " + result);
    }
}
