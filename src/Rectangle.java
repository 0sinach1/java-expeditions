import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){

        int rows = 6; int cols = 4;
        Scanner garri = new Scanner(System.in);

        System.out.print("Enter a digit: ");
        int digit = garri.nextInt();

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                if (i == 1 || i == rows || j == 1 || j == cols){
                    System.out.print(digit + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
