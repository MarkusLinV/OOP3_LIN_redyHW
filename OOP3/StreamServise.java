import java.util.Collections;
import java.util.List;

public class StreamServise {
    public void sort(List<Steam> arrayList){
        Collections.sort(arrayList, new StreamComparator());
    }
}