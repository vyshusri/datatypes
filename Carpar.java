public class Carpar {
    String brand;
    String model;
    int year;
    long cost;
public Carpar(String brand,String model,int year,long cost){
    this.brand=brand;
    this.model=model;
    this.year=year;
    this.cost=cost;
}
public static void main(String[] args) {
    Carpar car1=new Carpar("Yashash","Y" , 2028, 105003000);
    Carpar car2=new Carpar("shiva", "S", 2029, 1024885582);
car1.cost();
car1.all();
}

    public void cost() {
        System.out.println(cost);
        
    }
    public void all(){
        System.out.println(brand  +"\n" + model  + "\n"+ year);
    }
}
