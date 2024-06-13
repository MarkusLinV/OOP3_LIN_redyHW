import java.util.Comparator;

public class StreamComparator implements Comparator<Steam>{

    @Override
    public int compare(Steam o1, Steam o2) {
        return o1.groups.size() - o2.groups.size();
    }
    
}
