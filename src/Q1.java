import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        int rows = 6; int cols = 4;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your desired number of output: ");
        int digit = input.nextInt();

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                System.out.print(digit + " ");
            }
            System.out.println();
        }
    }
}
