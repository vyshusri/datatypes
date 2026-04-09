public class task7{
    static String Name="Sriram Vaishnavi";
    static long Adharno=350555855351L;
     static String fatherName="Sriram Krishna";
     static String State="Andhra";
     static  int Pin=501852;
     static String village="Kalladi";
     static String Mandal="Aloor";
     static String District="Nizamabad";
     static int HNo=1-1/1;
    public static void Name(){
        System.out.println("Full Name :" + Name);
    }
    public static void fatherName(){
    System.out.println("Father Name: "+ fatherName);

    }
    public static void State(){
    System.out.println("State: "+ State);

    }

    
    public static void village(){
    System.out.println("Village: "+village);
    }
    public static void Mandal(){
    System.out.println("Mandal: "+Mandal);
    }
    public static void District(){
    System.out.println("District: "+District);
    }
    public static void Pin(){
    System.out.println("Pin: "+Pin);

    }
    
   
    public static void NewName(String Name){
          System.out.println("New Name:"+Name);


    }
    public static void checkPin(int checkPin){
        if(checkPin==Pin){
          System.out.println("pin is correct");
        }
          else{
    System.out.println("pin is incorrect");

    }
            }
            public static void NewState(String newState) {
                State=newState;
                System.out.println("state changed successfully");
            }
            public static void Adharno() {
               System.out.println("Adharno:"+Adharno); 
            }
    
    public static void main(String[] args) {
        Name();
   NewName("Vaishnavi Sriram");
    fatherName();
    Pin();
    checkPin(501852);
    Pin();
    State();
    NewState("Telangana");
    State();
    village();
    Mandal();
    District();
    Adharno();
    
    }

     }