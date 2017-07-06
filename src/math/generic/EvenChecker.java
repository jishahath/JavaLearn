package math.generic;

import java.util.Scanner;

/**
 * Created by tecsol on 17/03/17.
 */
public class EvenChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFunctions nf = new NumberFunctions();

        while (true) {
            System.out.print("Enter an integer:");
            int n = sc.nextInt();

            if (n == 0) {
                System.exit(0);
            }

            String message = nf.isEven(n) ? "is an Even" : "is not an Even";
            System.out.println(message);
        }
    }

}
