import java.util.Scanner;
public class Patroll {
    public static void main(String[] args) {
        /*
        1.nextByte() ชนิดข้อมูลแบบ Byte
        2.nextDouble() ชนิดข้อมูลแบบ Double
        3.nextFloat() ชนิดข้อมูลแบบ Float
        4.nextInt() ชนิดข้อมูลแบบ Int
        5.nextLine() ชนิดข้อมูลแบบ ข้อความ
        6.nextLong() ชนิดข้อมูลแบบ 
        7.nextShort() ชนิดข้อมูลแบบ 
         */
        String name;
        int hours;
        double payRate;
        double groosPay;
        Scanner Key1 = new Scanner(System.in);
        System.out.print("What is Your Name? : ");
        name = Key1.nextLine();
        System.out.print("How many Hours did you work this week? : ");
        hours = Key1.nextInt();
        System.out.print("What is Your hourly pay rate? : ");
        payRate = Key1.nextInt();
        groosPay = hours*payRate;
        System.out.println("my name is "+name);
        System.out.println("is "+hours+" /week");
        System.out.println("Pay Rate "+payRate+" /hours");
        System.out.println("is "+groosPay+" week");
    }
}
