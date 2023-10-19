import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    private final List<Integer> primes = new ArrayList<>();

    //method that checks whether the number given is prime/not
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //method that generates the first N prime numbers and stores them into a list of 'primes'
    public void generatePrimes(int n) {
        int count = 0;
        int num = 2;
        while (count < n) {
            if (isPrime(num)) {
                primes.add(num);
                count++;
            }
            num++;
        }
    }

    //method to print list of primes
    public void printPrimes() {
        System.out.println("The first " + primes.size() + " prime numbers are:");
        System.out.println(primes);
    }

}
