public class Main {
    public static void main(String[] args) {
        int n = 5; // Change this to the desired position
        System.out.println("The " + n + "th prime number is: " + findNthPrime(n));
    }

    public static int findNthPrime(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("The value of n must be a positive integer.");
        }

        int count = 0; // Number of primes found
        int number = 1; // Current number to check for primality
        int nthPrime = 0;

        while (count < n) {
            number++;
            if (isPrime(number)) {
                count++;
                nthPrime = number;
            }
        }

        return nthPrime;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true; // 2 is the only even prime number
        }
        if (number % 2 == 0) {
            return false; // No other even number can be prime
        }

        // Check for factors from 3 to sqrt(number)
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
