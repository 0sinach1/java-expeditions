package SemOne;

import java.util.Scanner;


public class RectanglePrint {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a digit: ");
            int n = input.nextInt();

            int cols = 4; int rows = 6;

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    if(i == 1||i == rows||j == 1||j == cols){
                        System.out.print(n + " ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }

