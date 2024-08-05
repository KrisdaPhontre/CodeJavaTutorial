public class Ex52 {
    public static int calculateCube(int x) {
        return x * x * x;
    }
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            int cube = calculateCube(x);
            System.out.println("The value in x^3 :"+ cube);
        }
    }
}
