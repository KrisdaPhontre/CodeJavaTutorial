import java.util.Scanner;
public class Ex5 {

    public static double testAres(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("length: ");
        double base = scanner.nextDouble();
        System.out.print("height: ");
        double height = scanner.nextDouble();
        double area = testAres(base, height);
        System.out.printf("area of ​​triangle : ", area);
    }
}