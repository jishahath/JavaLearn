package math.generic;

import java.util.Scanner;

/**
 * Created by tecsol on 17/03/17.
 */
public class NumberFunctions {

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }

        return false;
    }

    public boolean isPrime(int number) {
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int sum(int p, int q) {
        int c = p + q;

        return c;
    }

    public void sample() {
        int option = 0;

        switch (option) {
            case 1:
                // do some thing
                break;
            case 2:
                // do other thing
                break;
        }
    }

}
