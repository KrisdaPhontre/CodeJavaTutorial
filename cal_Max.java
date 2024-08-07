import java.util.*;
public class cal_Max {
    public static void main(String[] args) {
        int num1, num2;
        Scanner stdin = new Scanner(System.in);
        System.out.println("Input number1 : ");
        num1 = stdin.nextInt();
        System.out.println("Input number2 : ");
        num2 = stdin.nextInt();
        int large = TestMax.max(num1, num2);
        System.out.println("Max Data is "+large);
    }
}
