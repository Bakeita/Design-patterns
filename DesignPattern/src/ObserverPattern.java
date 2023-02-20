import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class WheaterData implements Subject{

    private double temperature,humidity,pressure;
    List<Observers> observers = new ArrayList<Observers>();
    @Override
    public void registerObserver(Observers observer) {
       observers.add(observer);
    }

    @Override
    public void removeObserver(Observers ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObserver() {
       for(Observers v: observers){
           v.update(temperature,humidity,pressure);
       }
    }
}

public class ObserverPattern {
}
