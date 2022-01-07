package uebung08;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 @author Die_drei_von_Nebenan>
 */

public class AccountTest {
    Account accountDonald = new Account("Donald Duck");
    Account accountScrooge = new Account("Dagobert Duck");

    @Test
    void getOwnerTest() {
        assertEquals("Donald Duck", accountDonald.getOwner());
        assertEquals("Dagobert Duck", accountScrooge.getOwner());
    }

    @Test
    void depositTest() {
        accountDonald.deposit(10000); //10 Euro
        accountScrooge.deposit(50000); //50 Euro

        assertEquals(10000, accountDonald.getBalance());
        assertEquals(50000, accountScrooge.getBalance());
    }

    @Test
    void transferTest() {
        accountDonald.deposit(10000); //10 Euro
        accountScrooge.deposit(50000); //50 Euro

        assertFalse(accountDonald.transfer(200000, accountDonald));
        assertTrue(accountScrooge.transfer(25000, accountDonald));
        assertFalse(accountDonald.transfer(-1, accountScrooge));
        assertEquals(35000, accountDonald.getBalance());
        assertEquals(25000, accountScrooge.getBalance());

    }

    @Test
    void withdrawTest() {
        accountDonald.deposit(10000); //10 Euro
        accountScrooge.deposit(50000); //50 Euro

        assertTrue(accountDonald.withdraw(1000));
        assertFalse(accountScrooge.withdraw(234589999));
        assertFalse(accountScrooge.withdraw(-1));
        assertEquals(9000, accountDonald.getBalance());

    }


    @Test
    void getBalanceTest() {
        accountDonald.deposit(10000); //10 Euro
        accountScrooge.deposit(50000); //50 Euro

        assertEquals(10000, accountDonald.getBalance());
        assertEquals(50000, accountScrooge.getBalance());

    } 




}
