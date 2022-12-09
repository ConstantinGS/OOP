package Desktop.java.seminar4;

public class AverageShield implements Shield{


    @Override
    public Integer block() {
        return 30;
    }

    @Override
    public String toString() {
        return String.format("AverageShield blocks %d", block());
    }


    
}
