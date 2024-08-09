public class Librarian {
    public static void main(String[] args) {
        Studen1 st1,st2;
        LibraryCard1 card1,card2;

        st1 = new Studen1();
        st1.setName1("jon java");
        st1.setEmail1("jj@gmail.com");

        st2 = new Studen1();
        st2.setName1("Aom");
        st2.setEmail1("Aom@gmail.com");

        card1 = new LibraryCard1();
        card1.setOwnerName(st1);
        card1.checkOut(3);

        card2 = new LibraryCard1();
        card2.setOwnerName(st2);
        card2.checkOut(4);

        System.out.println("Card1 Info : ");
        System.out.println(card1.toString()+"\n");
        System.out.println("Card2 Info : ");
        System.out.println(card2.toString()+"\n");
    }
}
