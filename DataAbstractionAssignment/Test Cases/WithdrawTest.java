import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WithdrawTest {
    Date date;
    Withdraw test;

    @Before
    public void setUp(){
        date = new Date();
        test = new Withdraw(400.0, date, "Checking");
        test = new Withdraw(500.0, date, "Saving");

    }

    //Test for Withdraw.toString()
    @Test
    public void testToString(){
        //test for the right account
        assertEquals("Checking", Customer.CHECKING);
        assertEquals("Saving", Customer.SAVING);
    }







}
