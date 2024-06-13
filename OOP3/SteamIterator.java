import java.util.Iterator;

public class SteamIterator implements Iterator<StudentGroup>{
    
    private Steam steam;
    private int index = 0;

    public SteamIterator(Steam steam) {
        this.steam = steam;
    }

    @Override
    public boolean hasNext() {
        return index < steam.groups.size();
    }

    @Override
    public StudentGroup next() {
        return steam.groups.get(index++);
    }
}
