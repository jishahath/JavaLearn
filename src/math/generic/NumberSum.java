package math.generic;

import java.util.Scanner;

/**
 * Created by tecsol on 04/04/17.
 */
public class NumberSum {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter the limit");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
            System.out.println(+sum);

        }
    }
}
