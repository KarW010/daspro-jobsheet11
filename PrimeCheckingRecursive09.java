import java.util.Scanner;

public class PrimeCheckingRecursive09 {
    static boolean isPrimeRecursive(int n, int divisor) {
        if (n < 2) {
            return false; 
        }
        if (divisor == 1) {
            return true; 
        }
        if (n % divisor == 0) {
            return false; 
        }
        return isPrimeRecursive(n, divisor - 1); 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = input.nextInt();
        boolean isPrime = isPrimeRecursive(n, n / 2);

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
