import java.util.Scanner;

public class Factoriall {
    public static void main(String[] args){
//        make a program that takes in the input of a number and gives out the factor of the number from one to the number

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }

    }
}
