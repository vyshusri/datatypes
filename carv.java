public class carv extends vehicle{
    String fueltype;
   public carv (String brand,int speed,String fueltype){
    super(brand,speed);
    this.fueltype=fueltype;
   }
   public void fuelType(){
    System.out.println(fueltype);
   }
}
