package KPwork;
public class Demoarg {
    public static void main(String[] args) { //นำค่าเข้าสู่ function
        System.out.println("star in main.");
        System.out.println("--------------------");
        int testNum = 10;
        int total;
        DisplayValue(5);
        DisplayValue(testNum);
        DisplayValue(testNum * 5);
        total = showSum(3,4);
        System.out.println("Total have value : "+ total +".");
        System.out.println("--------------------");
        System.out.println("Back in the main.");

    }
    public static void DisplayValue(int num) {
        System.out.println("Value is "+num+".");

    }
    public static int showSum(int x, int y) {
        int sum;
        sum = x+y;
        return sum;
    }
}
