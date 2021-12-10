package uebung8;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 @author <Julian Kropp (Die_drei_von_Nebenan)>
 */

public class AccountTest {
    @Test
    /*
    possible testcases:
        - not enough money when transfering
        - not enough money when withdrawing money
        - try to deposit negative money
        - amount has more than two decimal places --> not possible when I use cents only, so I changed double to int
        - input isn't a double
     */
    public static void main(String[] args) {
        Account accountDonald = new Account("Donald Duck");
        Account accountScrooge = new Account("Dagobert Duck");

        accountDonald.deposit(10000);
        accountDonald.transfer(5000,accountScrooge);
        assertEquals(5000, accountScrooge.getBalance());
        accountScrooge.transfer(6000, accountDonald);
        assertEquals(5000, accountScrooge.getBalance());
        accountDonald.deposit(-1000);
        assertEquals(5000,accountDonald.getBalance());
        accountDonald.withdraw(-1000);
        assertEquals(5000,accountDonald.getBalance());


        System.out.println(accountDonald.getBalance());
        System.out.println(accountScrooge.getBalance());

    }
}
