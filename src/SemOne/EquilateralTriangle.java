package SemOne;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your value of s");
        double s = input.nextDouble();

        double A = (Math.sqrt(3)/4)*(s*s);

        System.out.println(A);
    }

}
