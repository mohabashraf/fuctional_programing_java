package car;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class CarBenchMark {

    public static void showAll(List<Car> carList) {
        for (Car car:carList) {
            System.out.println(car.toString());
        }
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
    }
}
