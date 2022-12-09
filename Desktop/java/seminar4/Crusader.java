package Desktop.java.seminar4;

public class Crusader extends Warrior<Sword, Shield>{

    public Crusader(String name, Integer healthPoint, Sword weapon, Shield shield) {
        super(name, healthPoint, weapon, shield);
    }

    @Override
    public String toString() {
        return String.format("Crusader - %s",super.toString());
    }
}