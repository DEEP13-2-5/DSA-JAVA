public class Fibonacci {
    // Method to print the Fibonacci series up to n terms
    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1; // Initial two terms of the Fibonacci sequence
        System.out.print(first + " " + second); // Print the first two terms
        
        for (int i = 2; i < n; i++) { // Start from the 3rd term
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
        System.out.println(); // Move to the next line after printing the series
    }

    public static void main(String[] args) {
        int n = 10; // Number of terms to print in the Fibonacci series
        System.out.println("Fibonacci series up to " + n + " terms:");
        printFibonacciSeries(n);
    }
}
