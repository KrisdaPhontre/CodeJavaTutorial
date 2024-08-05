package KPwork;
public class stringMethods {
    public static void main(String[] args) {
        String message = "Java is Great Fun";
        /*
        1.toUperCase()ตัวพิมพ์ใหญ่
        2.toLowerCase()ตัวพิมพ์เล็ก
        3.length()เก็บความของสตริง
        4.charAt()บอกให้เก็บตัวอักษรตามตำแหน่งที่ระบุ
         */
        String upper = message.toUpperCase();
        String Lower = message.toLowerCase();
        int length = message.length();
        char charAt = message.charAt(0);
        System.out.println(upper);
        System.out.println(Lower);
        System.out.println(length);
        System.out.println(charAt);
    }
}
