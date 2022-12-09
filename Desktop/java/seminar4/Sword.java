package Desktop.java.seminar4;

public class Sword implements Weapon{


    @Override
    public Integer damage() {
        return 50;
    }

    @Override
    public String toString() {
        return String.format("Sword - %d",damage());
    }
}