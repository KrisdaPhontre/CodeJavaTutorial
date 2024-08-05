
public class TestArray {
    public static void main(String[] args) {
        int [] num = new int [8];
    num[0] = 2;
    num[1] = 4;
    num[2] = 6;
    num[3] = 8;
    String[] s = new String[2];
    s[0] = "Aom"; 
    s[1] = "Krisda"; 
    System.out.println("Num[0] = :"+num[0]);
    System.out.println("Num[1] = :"+num[1]);
    System.out.println("Num[2] = :"+num[2]);
    System.out.println("Num[3] = :"+num[3]);
    System.out.println("Num[4] = :"+num[4]);
    num[3] = num[1+2] + num[0];
    System.out.println("num[3]"+num[3]);
    System.out.println("num[3]"+num.length);
    System.out.println("s[0]"+s[0]);
    System.out.println("s[0]"+s[1]);
    System.out.println("s[0]"+s[2]);
    }
}