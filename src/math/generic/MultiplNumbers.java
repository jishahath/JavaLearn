package math.generic;

import java.util.Scanner;

/**
 * Created by tecsol on 17/03/17.
 */
public class MultiplNumbers {

    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        mul(x, y);

        //int mul = mult(x, y) / 2;
        //System.out.println("ans is: " + mul);
    }

    public static void mul() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a * b;
        System.out.println("multiple of the two given numbers is :" + c);
    }

    public static void mul(int a, int b) {
        int c = a * b;
        System.out.println("multiple of two given numbers is :" + c);
    }

    public static int mult(int p, int q) {
        int c = p * q;

        return c;
    }

}