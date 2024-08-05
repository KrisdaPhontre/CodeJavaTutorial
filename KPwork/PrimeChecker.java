package KPwork;
import java.util.*;
public class PrimeChecker {
    public static void main(String[] args) {
        int number;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("What number would youlike to test?.");
        number = input.nextInt();
        if(isPrime(number)){
            System.out.println(number+" is a Prime number.");
        }else{
            System.out.println(number+" is not Prime.");
        }
    }
    public static boolean isPrime(int p) {
        if (p <= 1 ) {
            return false;
        }else if(p % 2 == 0){
            return true;
        }
        for(int i =3; i < p; i += 2){
            if (p % i == 0) {
                return false;
            }else{

            }
        }
    return true;
    }
}
