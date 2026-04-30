public class ticket {
    String Moviename;
    int Seatno;
    int price;
    
    public static void main(String[] args) {
       ticket ticket1=new ticket(); 
       ticket1.Moviename="sri";
       ticket1.Seatno=1;
       ticket1.price=250;

       ticket ticket2=new ticket();
       ticket2.Moviename="sai";
       ticket2.Seatno=2;
       ticket2.price=225;

       System.out.println(ticket2.Moviename);
       System.out.println(ticket2.price);

    }
}
