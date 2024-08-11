public class ExperimentalRemoteControlCar implements RemoteControlCar{
    int driven;
    public void drive() {
        driven+=20;
    }

    public int getDistanceTravelled() {
        return driven;
    }
}





class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
    int driven=0;
     int victories=0;
    public void drive() {
        driven+=10;
    }

    public int getDistanceTravelled() {
        return driven;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.victories=numberOfVictories;
    }
     public int compareTo(ProductionRemoteControlCar car) {
        return Integer.compare(car.getNumberOfVictories(), this.getNumberOfVictories());
    }
}





public interface RemoteControlCar {
    // TODO implement the RemoteControlCar interface
    void drive();
    int getDistanceTravelled();
}





import java.util.List;
import java.util.Collections;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        //throw new UnsupportedOperationException("Please implement the (static) TestTrack.race() method");
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        Collections.sort(cars);
        return cars;
    }
}
