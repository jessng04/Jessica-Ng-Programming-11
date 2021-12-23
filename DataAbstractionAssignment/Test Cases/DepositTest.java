import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DepositTest {
    Date date;
    Deposit test;

    @Before
    public void setUp(){
        date = new Date();
        test = new Deposit(400.0, date, "Checking");
        test = new Deposit(500.0, date, "Saving");

    }

    //Test for Deposit.toString()
    @Test
    public void testToString(){
        //test for the right account
        assertEquals("Checking", Customer.CHECKING);
        assertEquals("Saving", Customer.SAVING);
    }






}
