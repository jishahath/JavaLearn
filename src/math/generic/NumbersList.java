package math.generic;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tecsol on 25/03/17.
 */
public class NumbersList {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the limit");
        int n = sc.nextInt();

        for(int i = 0; i <= n; i++){
            System.out.println(+i );
        }

    }
}







