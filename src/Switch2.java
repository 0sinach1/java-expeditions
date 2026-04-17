import java.util.Scanner;
public class Switch2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Attendance Score: ");
        int attendance = scanner.nextInt();

        switch ((attendance > 100 ? 2 : attendance >= 75 ? 0 : 1) ) {
            case 0:
                System.out.println("Eligible");
                break;
            case 1:
                System.out.println("Not Eligible");
                break;
            case 2:
                System.out.println("Invalid");
                break;

            default:
                System.out.println("Unknown");
        }

    }
}
