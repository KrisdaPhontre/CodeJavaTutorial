package KPwork;
public class calFx {
    public static void main(String[] args) {
        for(int i = 0; i <=10 ; i++){
            System.out.println("Function of "+ i + " = " + fx(i));
            System.out.println("--------------------");
        }
    }

    public static int fx(int x) {
        int m;
        m = x * x + 5;
        System.out.println(""+m);
        return m;
    }
}