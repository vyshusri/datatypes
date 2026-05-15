package Encapsulation;

public class mobileInfo {
     String brand="Realme";
     String camera="Front 32MP,Rear 200MP+8MP+2MP";
     String model="RMX3742";
     int price=30000;
     double RAM=8.00;

public String Brand(){
    return brand;
}
public String Camera(){
    return camera;
}
public String Model(){
return model;
}
public int price(){
    return price;
}
public double RAM(){
    return RAM;
}
public static void main(String[] args) {
    mobileInfo obj=new mobileInfo();
    System.out.println("Brand:"+obj.Brand());
    System.out.println("Camera:"+obj.Camera());
   System.out.println("Model:"+obj.Model());
   System.out.println("Price:"+obj.price);
   System.out.println("RAM:"+obj.RAM());
    

}
    
}
