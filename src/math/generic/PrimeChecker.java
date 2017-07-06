package math.generic;

import java.util.Scanner;

/**
 * Created by tecsol on 17/03/17.
 */
public class PrimeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFunctions nf = new NumberFunctions();

        while (true) {
            System.out.print("Enter an integer (0 to exit): ");
            int n = sc.nextInt();

            if (n == 0) {
                System.exit(0);
            }

            String message = nf.isPrime(n) ? "is a prime" : "is NOT a prime";
            System.out.println(message);
        }
    }

}
