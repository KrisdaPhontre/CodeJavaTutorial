public class LengthDemo {
    public static void main(String[] args) {
        Rectangle box = new Rectangle();
        System.out.println("Sending the  value 10.0 to the setLength metthod");
        box.setLngth(10.0);
        box.setWidth(20.0);
        System.out.println("The Box's length is "+ box.setLngth());
        System.out.println("The Box's width is "+ box.getWidth());
        System.out.println("The Box's ares is "+ box.getArea());
        System.out.println("Done");
    }
}