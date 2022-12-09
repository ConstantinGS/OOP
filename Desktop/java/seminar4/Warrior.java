package Desktop.java.seminar4;

public abstract class Warrior<T extends Weapon, Y extends Shield> {
    private String name;
    private Integer healthPoint;
    private T weapon;
    private Y shield;


    public Warrior(String name, Integer healthPoint, Weapon weapon, Y shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = (T) weapon;
        this.shield = shield;
    }

    public String getName() {
        return name;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Shield getShield() {
        return shield;
    }

    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void getDamage(Integer damage, Integer armor) {
        if ((damage-armor)>0){
            healthPoint = healthPoint-(damage-armor);
            String.format("%s get %d damage", name, (damage-armor) );
        }
    }

    @Override
    public String toString() {
        if (shield!=null) {
            return String.format("%s, %d, %s, %s", name, healthPoint, weapon, shield );
        }
        return String.format("%s, %d, %s", name, healthPoint, weapon);
        
    }
}
