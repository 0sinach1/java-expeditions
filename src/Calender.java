import java.util.Scanner;

public class Calender {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value for proposed month: ");
        int month = input.nextInt();

        switch (month){
            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print("February ");
                break;
            case 3:
                System.out.print("January");
                break;
            case 4:
                System.out.print("January");
                break;
            case 5:
                System.out.print("January");
                break;
        }
    }

}
