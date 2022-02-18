package Ulam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UlamTest {

    @Test
    void ulamWert() {
        Ulam ulam = new Ulam();
        System.out.println(ulam.ulamWert(3));
    }
}