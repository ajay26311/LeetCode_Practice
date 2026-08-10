class Solution {
    static final long MOD = 1000000007;

    public int numPrimeArrangements(int n) {

        int primeCount = 0;

        // Count prime numbers
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }

        // Factorial of prime numbers
        long primeFact = 1;

        for (int i = 1; i <= primeCount; i++) {
            primeFact = (primeFact * i) % MOD;
        }

        // Factorial of non-prime numbers
        int nonPrimeCount = n - primeCount;

        long nonPrimeFact = 1;

        for (int i = 1; i <= nonPrimeCount; i++) {
            nonPrimeFact = (nonPrimeFact * i) % MOD;
        }

        return (int)((primeFact * nonPrimeFact) % MOD);
    }

    // Check whether a number is prime
    private boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}