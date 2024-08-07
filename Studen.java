public class Studen {
    private String id;   
    private String name;
    private double gpa;
    public void setDetails(String ID,String N,double GPA) {
        id = ID;
        name = N;
        gpa = GPA;
    }
    public void showDetails(){
        System.out.println();
        System.out.println("ID   { "+id+" }");
        System.out.println("Name { "+name+" }");
        System.out.println("GPA  { "+gpa+" }");
        System.out.println();
    }
    public static void main(String[] args) {
        Studen sc1 = new Studen();
        sc1.setDetails("202020", "Krissda", 4);
        sc1.showDetails();
        Studen sc2 = new Studen();
        sc2.setDetails("303030", "KP_Aom", 4);
        sc2.showDetails();
    }
}