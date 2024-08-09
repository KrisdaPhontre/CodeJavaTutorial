public class LibraryCard1 {
    private Studen1 owner;
    private int borrowcut;

    public LibraryCard1() {
        owner = null;
        borrowcut = 0;
    }
    public void checkOut(int numOfBooks){
        borrowcut = borrowcut + numOfBooks;
    }
    public void setOwnerName(Studen1 studen1){
        owner = studen1;
    }
    public int setNuberOfBooks(){
        return borrowcut;
    }
    public String setOwnerName(){
        return owner.getName1();
    }
    public String toString(){
        return "Owner Name    { " + owner.getName1()+ " }" +
        "\n" + "Email         { " + owner.getEmail1() + " }" + 
        "\n" + "Book Borrowed { " + borrowcut + " }";
    }
}
