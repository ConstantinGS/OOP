package Desktop.java.seminar4;

public class SukutumShield implements Shield{


    @Override
    public Integer block() {
        return 90;
    }

    @Override
    public String toString() {
        return String.format("SukutumShield blocks %d", block());
    }


    
}
