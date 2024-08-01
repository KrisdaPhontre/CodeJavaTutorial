import java.util.Scanner;
public class testAverage {
    public static void main(String[] args) {
        int num1,num2,num3;
        double Average;
        char repeat;
        String input;
        Scanner in = new Scanner(System.in);
        do{
            System.out.print("Enter Your Number #1 : ");
            num1 = in.nextInt();
            System.out.print("Enter Your Number #2 : ");
            num2 = in.nextInt();
            System.out.print("Enter Your Number #3 : ");
            num3 = in.nextInt();
            Average = (num1 + num2 + num3) / 3.0;
            System.out.println("The average is "+Average);
            System.out.println("");
            System.out.println("Would you like to test again : ");
            System.out.print("Enter Y for YES or N for ON :");
            in.nextLine();
            input = in.nextLine();
            repeat = input.charAt(0);
        }while( repeat  == 'Y' || repeat == 'y');
    }
}