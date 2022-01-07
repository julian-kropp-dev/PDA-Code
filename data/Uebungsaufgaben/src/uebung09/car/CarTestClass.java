package uebung09.car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTestClass {

    Car car;
    Kofferraum kofferraum;
    Motor motor;
    Reifen reifen;

    @BeforeEach
    void setup() {
        car = new Car();
    }

    @Test
    void speedTest() {
        car.setHoechstgeschwindigkeit(120.0);
        assertEquals(120.0, car.getHoechstgeschwindigkeit());
    }

    @Test
    void seatTest() {
        car.setSitze(5);
        assertEquals(5, car.getSitze());
    }

    @Test
    void doorTest() {
        car.setTueren(4);
        assertEquals(4, car.getTueren());
    }

    @Test
    void reifenTest() {
        Reifen[] neueReifenfuernAMG = {new Reifen(2.32, true), new Reifen(10.34, false)};
        car.setReifen(neueReifenfuernAMG);
        assertTrue(car.getReifen()[0].getPlatten());
        assertFalse(car.getReifen()[1].getPlatten());
    }

    @Test
    void kofferraumTest() {
        kofferraum = new Kofferraum(123.567);
        car.setKofferraum(kofferraum);
        assertEquals(123.567, car.getKofferraum().getVolumen());
    }

    @Test
    void motorTest() {
        motor = new Motor(24);
        car.setMotor(motor);
        assertEquals(24, car.getMotor().getHubraum());

    }

    @Test
    void fasterTest() {
        car.setHoechstgeschwindigkeit(223.0);
        Car cartwo = new Car();
        cartwo.setHoechstgeschwindigkeit(123.4);
        car.isFasterThanOtherCar(cartwo);
        assertTrue(car.isFasterThanOtherCar(cartwo));
    }
    

    @Test
    void testReifenwechsel() {
        Reifen[] arr = { new Reifen(10, false), new Reifen(5, true) };
        Reifen neu = new Reifen(3, false);
        car.setReifen(arr);
        assertEquals(arr[1], car.getReifen()[1]);
        car.erfolgreichReifenErsetzt(1, neu);
        assertEquals(neu, car.getReifen()[1]);
    }

}
