
import java.util.Scanner;
public class CalToNum {
    public static void main(String[] args) {
        int number;
        int x,y;
        Scanner Key = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("1.Add numbers");
        System.out.println("2.Multiply numbers");
        System.out.println("3.Divide numbers");
        System.out.println("4.Delete numbers");
        System.out.println("------------------------------");
        number = Key.nextInt();
        switch (number) {
            case 1:
            Scanner in = new Scanner(System.in);
            System.out.println("---------------");
            System.out.println("[1.Add numbers]");
            System.out.println("---------------");
                System.out.print("input Number1 : ");
                x = in.nextInt();
                System.out.print("input Number2 : ");
                y = in.nextInt();
                System.out.print(x+" + "+y+" = "+(x+y));
            break;
            case 2:
            Scanner in1 = new Scanner(System.in);
            System.out.println("---------------");
            System.out.println("[2.Multiply numbers]");
            System.out.println("---------------");
                System.out.print("input Number1 : ");
                x = in1.nextInt();
                System.out.print("input Number2 : ");
                y = in1.nextInt();
                System.out.print(x+" x "+y+" = "+(x*y));
            break;
            case 3:
            Scanner in2 = new Scanner(System.in);
            System.out.println("---------------");
            System.out.println("[3.Divide numbers]");
            System.out.println("---------------");
                System.out.print("input Number1 : ");
                x = in2.nextInt();
                System.out.print("input Number2 : ");
                y = in2.nextInt();
                System.out.print(x+" % "+y+" = "+(x/y));
            break;
            case 4:
            Scanner in3 = new Scanner(System.in);
            System.out.println("---------------");
            System.out.println("[4.Delete numbers]");
            System.out.println("---------------");
                System.out.print("input Number1 : ");
                x = in3.nextInt();
                System.out.print("input Number2 : ");
                y = in3.nextInt();
                System.out.print(x+" - "+y+" = "+(x-y));
            break;
            default:
            System.out.print("that's not 1,2,3 or 4!");
                break;
        }
    }
}
