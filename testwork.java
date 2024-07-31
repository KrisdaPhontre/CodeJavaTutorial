import java.util.Scanner;
public class testwork {
    public static void main(String[] args) {
        int number;
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
            int x,y;
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
            int x1,y1;
            System.out.println("---------------");
            System.out.println("[2.Multiply numbers]");
            System.out.println("---------------");
                System.out.print("input Number1 : ");
                x1 = in1.nextInt();
                System.out.print("input Number2 : ");
                y1 = in1.nextInt();
                System.out.print(x1+" x "+y1+" = "+(x1*y1));
            break;
            case 3:
            Scanner in2 = new Scanner(System.in);
            int x2,y2;
            System.out.println("---------------");
            System.out.println("[3.Divide numbers]");
            System.out.println("---------------");
                System.out.print("input Number1 : ");
                x2 = in2.nextInt();
                System.out.print("input Number2 : ");
                y2 = in2.nextInt();
                System.out.print(x2+" % "+y2+" = "+(x2/y2));
            break;
            case 4:
            Scanner in3 = new Scanner(System.in);
            int x3,y3;
            System.out.println("---------------");
            System.out.println("[4.Delete numbers]");
            System.out.println("---------------");
                System.out.print("input Number1 : ");
                x3 = in3.nextInt();
                System.out.print("input Number2 : ");
                y3 = in3.nextInt();
                System.out.print(x3+" - "+y3+" = "+(x3-y3));
            break;
            default:
            System.out.print("that's not 1,2,3 or 4!");
                break;
        }
    }
}
