
import java.util.Scanner;
public class ifAct {
    public static void main(String[] args) {
        double score;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the score :");
        score = in.nextDouble();
        if (score >= 60) 
            System.out.println("Your Score : "+score+" you are pass");
        else{
            
            System.out.println("Your Score : "+score+" you are not pass");
        }
        
    }
}