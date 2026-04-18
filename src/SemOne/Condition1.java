package SemOne;

import java.util.Scanner;

public class Condition1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Value: ");
        int attendance = scanner.nextInt();

        if(attendance >= 75){
            System.out.println("Qualified!!!");
        }else{
            System.out.print("Not Qualified😭");
        }

    }
}
