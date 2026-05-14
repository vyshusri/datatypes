package polymorphism;

public class mainMethod {
    public static void main(String[] args) {
        Animal[] animal={new Dog(),new Cat()};
        for(Animal s :animal){
            s.sound();
        }
    }
    
}
