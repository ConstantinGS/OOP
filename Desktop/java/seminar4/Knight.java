package Desktop.java.seminar4;

public class Knight extends Warrior<Sword, AverageShield>{

    public Knight(String name, Integer healthPoint, Sword weapon2, AverageShield shield) {
        super(name, healthPoint, weapon2, shield);

    }

    @Override
    public String toString() {
        return String.format("Knight - %s",super.toString());
    }
}