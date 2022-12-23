import java.util.ArrayList;

public class ModArrayList<A> extends ArrayList<A> {
    public A getValidIndex(int index){
        int validIndex= Math.abs(index) % this.size();
        return this.get(validIndex);
    }

}
