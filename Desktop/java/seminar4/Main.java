package Desktop.java.seminar4;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Hiro",150,new Staff(), null);
        Hero hero2 = new Hero("Imir",150,new Staff(), null);
        Team<Warrior> red = new Team<>(hero1);
        red.add(new Archer("Man",100,new LongBow(),null, 20));
        red.add(new Archer("Alex",100,new Bow(),null, 15));
        red.add(new Knight("Sir",100,new Sword(),new AverageShield()));
        Team<Warrior> blue = new Team<>(hero2);
        blue.add(new Archer("Man2",100,new Bow(),null, 20));
        blue.add(new Mage("Alex2",100,new Staff(),15,30, null));
        blue.add(new Crusader("Crus",100,new Sword(),new SukutumShield()));

        

        System.out.println(red);
        System.out.println(blue);
        System.out.println(blue.getTeamHelspoint());

        


    }
}