package KPwork;
public class Loopcall {
    public static void main(String[] args) {
        System.out.println("Hello from the main method.");
        for(int i = 1; i <= 5; i++){
            displayMessage();
        }
        System.out.println("Back in the main method.");
    }
    public static void displayMessage(){
        System.out.println("Hello from the dissplaymessage.");
    }
}
