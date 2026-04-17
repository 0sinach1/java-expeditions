import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner garri = new Scanner(System.in);

        int sumEven = 0;
        int sumOdd = 0;

        int numbers[] = new int[5];

        for(int i = 0; i < numbers.length; i++){

            System.out.print("Enter a digit: ");
            int arrDigit = garri.nextInt();

            numbers[i] = arrDigit;

            if(numbers[i] % 2 == 0){
                sumEven += numbers[i];
            } else if (numbers[i] % 2 != 0) {
                sumOdd += numbers[i];
            }
            else {
                System.out.print("Not a valid input");
            }
        }
        System.out.println("The sum of the the odd numbers in the array is " + sumOdd);
        System.out.println("The sum of the the even numbers in the array is " + sumEven);

    }
}
