import java.util.*;
public interface BarChart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        System.out.print("Input Data: ");
        x = in.nextInt();
        Bar(x);
    }
    public static void Bar(int Data) {
        for(int i = 1; i <= Data; i++){
            System.out.print(" * ");
        }
    }
}
