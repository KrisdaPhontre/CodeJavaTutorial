import java.util.Scanner;

public class Ex54 {
    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "even numbers";
        } else {
            return "odd number";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("PutNumber: ");
        int number = scanner.nextInt();
        String result = checkEvenOdd(number);
        System.out.println("Number: " + result);
    }
}
