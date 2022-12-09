package Desktop.java.seminar4;

public class Fighter extends Warrior<Sword, BacklerShield>{

    public Fighter(String name, Integer healthPoint, Sword weapon2, BacklerShield shield) {
        super(name, healthPoint, weapon2, shield);

    }

    @Override
    public String toString() {
        return String.format("Fighter - %s",super.toString());
    }
}