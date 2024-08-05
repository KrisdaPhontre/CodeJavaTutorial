
public class whileLoop {
    public static void main(String[] args) {
        System.out.println("[---------------------------]");
        int iwhile = 1, sum = 0;
        while (iwhile <= 100) {
            sum += iwhile;
            iwhile++;
            System.out.println(+iwhile);
        }
        System.out.println("all : "+sum);
        System.out.println("[---------------------------]");
    }
}
