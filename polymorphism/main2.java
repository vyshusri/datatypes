package polymorphism;

public class main2 {

    public static void main(String[] args) {
        animalSound obj=new animalSound();
        Dog1 obj1=new Dog1();
        Cat1 obj2=new Cat1();
        Cow obj3=new Cow();
    
        System.out.println("animal sounds:");    
        System.out.println(obj.brak());
        System.out.println(obj1.sound());
        System.out.println(obj2.sound());
        System.out.println(obj3.sound());



}
    }
    

