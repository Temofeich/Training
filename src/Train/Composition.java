package Train;

import java.util.ArrayList;
import java.util.List;

public class Composition {

    private List<Train> trains;
    private int compositionSize;

    public Composition(int compositionSize){
        this.compositionSize = compositionSize;
        trains = new ArrayList<Train>();
    }

    public List<Train> getTrains() {
        return trains;
    }
     public boolean add(Train train){
        if (trains.size() >= compositionSize){
            return false;
        }
        trains.add(train);
        return true;
     }
}
