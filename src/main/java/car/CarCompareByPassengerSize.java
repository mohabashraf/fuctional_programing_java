package car;

import java.util.Comparator;

public class CarCompareByPassengerSize implements Comparator<Car> {

    public int compare(Car o1, Car o2) {
        return o1.getPassenger().size() - o2.getPassenger().size();
    }
}
