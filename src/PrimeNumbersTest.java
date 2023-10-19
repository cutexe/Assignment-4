import java.util.Scanner;

public class PrimeNumbersTest {
    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("How many primes would you like to compute? ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("That's an invalid, please try again!:D ");
                scanner.next(); //clear the invalid inputs
            }
        }

        primeNumbers.generatePrimes(n);
        primeNumbers.printPrimes();
    }
}

//Output
//How many primes would you like to compute? 14
//The first 14 prime numbers are:
//[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43]
//
//Process finished with exit code 0