public class Rectangle {
    private double length;
    private double width;
    public void setLngth(double len){
        length = len;
        System.out.println("Length = "+length);
    }
    public void setWidth(double W){
        width = W;
    }
    public double setLngth(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return length * width ;
    }
}
