public class OverloadDeom {
    int x ;
    OverloadDeom(){
        System.out.println("insedde OverloadDeom().");
        x = 0;
    }
    OverloadDeom(int i){
        System.out.println("insedde OverloadDeom(int).");
        x = i;
    }
    OverloadDeom(double d){
        System.out.println("insedde OverloadDeom(double).");
        x = (int)d;
    }
    OverloadDeom(int  i,int j){
        System.out.println("insedde OverloadDeom(int , int).");
        x = i * j ;
    }

}
