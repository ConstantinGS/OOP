package Desktop.java.seminar4;

public class BacklerShield implements Shield{


    @Override
    public Integer block() {
        return 15;
    }

    @Override
    public String toString() {
        return String.format("BacklerShield blocks %d", block());
    }


    
}
