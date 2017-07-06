package math.generic;

import java.util.Scanner;

/**
 * Created by tecsol on 04/04/17.
 */
public class NumberFactorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
            System.out.println("The Factorial Of " +n +" is" +fact );

    }
}
