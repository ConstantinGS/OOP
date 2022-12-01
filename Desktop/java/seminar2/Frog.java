package seminar2;

public class Frog extends Animal implements SwimAble, RunAble, SpeakAble {

    public Frog(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
        
    }

    @Override
    public String swim() {
       
        return "20 km/h";
    }

    @Override
    public String run() {
       
        return "1 km/h";
    }

    @Override
    public String speak() {
        
        return "Qwa";
    }

    
    
}
