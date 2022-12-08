package Desktop.java.seminar3;
import java.util.Iterator;

public class UserIterator implements Iterator<User> {
    
    private User iterUser;
    private int count = 0;

    public UserIterator(User user) {
        iterUser = user;
    }

    @Override
    public boolean hasNext() {
        return iterUser.nextUser!=null;
    }

    @Override
    public User next() {
        if(iterUser!=null && count==0){
            if (hasNext()){
                count++;
            }
            return iterUser;
            
            
        }

        else if (hasNext() ) {
            User iUser = iterUser;
            iterUser = iUser.nextUser;
            count++;
            return iUser.nextUser;
        }
        return null;
        
    }
    
}
