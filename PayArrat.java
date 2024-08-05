import java.util.Scanner;

public class PayArrat {
    public static void main(String[] args) {
        final int EMPLOYEES = 5;
        double payRatge;
        double grossPay;
        int [] housr = new int [EMPLOYEES];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The House Worked By " + EMPLOYEES + "Employees who all earn.");
        for(int index = 0; index < EMPLOYEES; index++){
            System.out.print("Employees #" + (index + 1) + ": ");
            housr[index] = in.nextInt();

        }
        System.out.print("Enter the housr pay rate for each employees : ");
        payRatge = in.nextDouble();
        for(int index = 0; index < EMPLOYEES; index++){
            grossPay = housr[index] * payRatge;
            System.out.println("Employees #" + (index + 1) + ": $" + grossPay);
        }
    }
}
