package SemOne;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();


        while(number < 10){
            System.out.println(number);
            number += 2;
        }
    }
}
