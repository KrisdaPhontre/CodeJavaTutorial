package KPwork;
import java.util.Scanner; //step1 เรียกใช้คลาส Scanner
public class calnum {
    public static void main(String[] args) {
    int x,y;
    Scanner in = new Scanner(System.in);
    System.out.println("input Number1 : ");
    x = in.nextInt();
    System.out.println("Your Number is :"+x);
    System.out.println("input Number2 : ");
    y = in.nextInt();
    System.out.println("Your Number is :"+y);
    System.out.println(x+"+"+y+"="+(x+y));
    }
}
