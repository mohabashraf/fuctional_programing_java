package car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class CarBenchMark {

    public static void showAll(List<Car> carList) {
        for (Car car:carList) {
            System.out.println(car.toString());
        }
        System.out.println("------------------------");
    }

    public static List<Car> getCarsWithCriteria(Iterable<Car> carList, Criteria criteria){
        List<Car> outputCarList = new ArrayList<Car>();
        for(Car car : carList){
            if(criteria.test(car))
                outputCarList.add(car);
        }
        return outputCarList;
    }
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                Car.carWithGasColorPassengers(6, "Red", "Fred", "Jim", "Sheila"),
                Car.carWithGasColorPassengers(3, "Octarine", "Rincewind", "Ridcully"),
                Car.carWithGasColorPassengers(9, "Black", "Weatherwax", "Magrat"),
                Car.carWithGasColorPassengers(7, "Green", "Valentine", "Gillian", "Anne", "Dr. Mahmoud"),
                Car.carWithGasColorPassengers(6, "Red", "Ender", "Hyrum", "Locke", "Bonzo")
        );
        showAll(cars);
        showAll(getCarsWithCriteria(cars, new ColorCriteria()));
        cars.sort(new CarCompareByPassengerSize());
        showAll(cars);
    }
}
