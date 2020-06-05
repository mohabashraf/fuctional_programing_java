package car;

public class ColorCriteria implements Criteria{
    public boolean test(Car car) {
        return car.getColor().equals("Red")? true : false;
    }
}
