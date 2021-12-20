package uebung9.car;
import org.junit.jupiter.api.Test;

public class CarTestClass {
    @Test
    public static void main(String[] args) {
        Car eins = new Car(250.4);
        Car zwei = new Car(250.3);

        System.out.println(eins.isFasterThanOtherCar(zwei.getHoechstgeschwindigkeit()));

    }
}
