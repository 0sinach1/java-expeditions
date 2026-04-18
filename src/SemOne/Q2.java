package SemOne;

import java.util.Arrays;
import java.util.Scanner;


public class Q2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        double numbers[] = new double[20];
        double sum = 0;

        System.out.print("Enter a 20 digits: ");

        for(int i = 1; i < numbers.length; i++){
            numbers[i] = input.nextDouble();

            sum += numbers[i];
//            System.out.print(" " + sum + " ");

        }

        Arrays.sort(numbers);


        double median;

        if (numbers.length % 2 == 0) {
            median = (numbers[numbers.length / 2 - 1]
                    + numbers[numbers.length / 2]) / 2.0;
        } else {
            median = numbers[numbers.length / 2];
        }



        System.out.println("the mean of those numbers were: " + (sum / numbers.length));
        System.out.println("the median of those numbers were: " + median);
    }
}
