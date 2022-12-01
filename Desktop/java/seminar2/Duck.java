package seminar2;

public class Duck extends Animal implements SpeakAble, RunAble, FlyAble {

    public Duck(String name, String breed, String colour, Integer countLegs, Integer age) {
        super(name, breed, colour, countLegs, age);
        
    }

    @Override
    public String run() {
        return "5 km/h";
        
    }

    @Override
    public String speak() {
    
        return "Crya";
    }

    @Override
    public String fly() {

        return "60 km/h";
    }
    
    
}
