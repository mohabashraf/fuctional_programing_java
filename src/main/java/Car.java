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



}
