public class calOverload {
    public static void main(String[] args) {
        OverloadDeom o1 = new OverloadDeom();
        OverloadDeom o2 = new OverloadDeom(88);
        OverloadDeom o3 = new OverloadDeom(24.7);
        OverloadDeom o4 = new OverloadDeom(2,4);
        System.out.println("o1.x : "+o1.x);
        System.out.println("o2.x : "+o2.x);
        System.out.println("o3.x : "+o3.x);
        System.out.println("o4.x : "+o4.x);
    }
}
