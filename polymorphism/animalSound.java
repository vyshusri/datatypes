package polymorphism;

public class animalSound {
    public String sound(){
        return "no sound";
    }
    public String bark(){
        return sound();
    }
    
}
