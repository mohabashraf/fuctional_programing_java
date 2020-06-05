import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Car {
    private final String color;
    private final int gasLevel;
    private final List<String> passenger;
    private final List<String> trunkContent;


    private Car(String color, int gasLevel, List<String> passenger, List<String> trunkContent) {
        this.color = color;
        this.gasLevel = gasLevel;
        this.passenger = passenger;
        this.trunkContent = trunkContent;
    }

    public static Car carWithGasColorPassengers(int gasLevel, String color, String... passenger){
        List<String> passengers = Collections.unmodifiableList(Arrays.asList(passenger));
        return new Car(color, gasLevel, passengers, null);
    }

    public static Car carWithGasColorPassengersTrunkContent(int gasLevel, String color, String... passenger){
        List<String> passengers = Collections.unmodifiableList(Arrays.asList(passenger));
        return new Car(color, gasLevel, passengers, Arrays.asList("spare wheel", "wrench"));
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", gasLevel=" + gasLevel +
                ", passenger=" + passenger +
                ", trunkContent=" + trunkContent +
                '}';
    }

    public String getColor() {
        return color;
    }

    public int getGasLevel() {
        return gasLevel;
    }

    public List<String> getPassenger() {
        return passenger;
    }

    public List<String> getTrunkContent() {
        return trunkContent;
    }
}
