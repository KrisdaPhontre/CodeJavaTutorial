import java.util.Scanner;
public class cirleArea {
    public static void main(String[] args) {
        double radius;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius :");
        radius = in.nextDouble();
        if (radius <= 0) 
            System.out.println("ERROR!!");
        else{
            double area = 3.141 * radius * radius;
            System.out.println("Teh area is "+area);
        }
        
    }
}
