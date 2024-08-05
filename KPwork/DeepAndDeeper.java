package KPwork;
public class DeepAndDeeper {
    public static void main(String[] args) {
        System.out.println("I am staring in main.");
        deep();
        System.out.println("Now I am Back in main.");
    }
    public static void deep() {
        System.out.println("I am now in deep.");
        deepper();
        System.out.println("Now I am Back in deep.");
    }
    public static void deepper(){
        System.out.println("I am now in deepper.");
    }
}
