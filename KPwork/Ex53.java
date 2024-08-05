package KPwork;
import java.util.Scanner;

public class Ex53 {
    public static int findMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number #1: ");
        int num1 = scanner.nextInt();
        System.out.print("Number #2: ");
        int num2 = scanner.nextInt();
        int max = findMax(num1, num2);
        System.out.println("Maximum value #1 & #2 :" + max);
    }
}
