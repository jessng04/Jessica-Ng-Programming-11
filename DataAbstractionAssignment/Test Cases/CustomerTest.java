import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer test;
    Date date;

    @Before
    public void setUp(){
        test = new Customer("Jessica", 10, 400.0, 500.0);
        date = new Date();
    }

    //Test for Customer.deposit()
    @Test
    public void testCustomerDeposit(){
        test.deposit(400.0, date, Customer.CHECKING);
        test.deposit(500.0, date, Customer.SAVING);

        assertEquals("Checking", Customer.CHECKING);
        assertEquals("Saving", Customer.SAVING);

        assertEquals(test.getCheckDeposit(), test.getCheckBalance(),0);
        assertEquals(test.getSavingDeposit(), test.getSavingBalance(),0);

    }

    //Test for Customer.withdraw()
    @Test
    public void testCustomerWithdraw(){
        //test objects
        test.withdraw(400.0, date, Customer.CHECKING);
        test.withdraw(500.0,date,Customer.SAVING);

        //test right accounts
        assertEquals("Checking",Customer.CHECKING);
        assertEquals("Saving", Customer.SAVING);

        //test checking and saving withdraws are taken from new account balance
        assertEquals(test.getCheckWithdraw(), test.getCheckBalance(),0);
        assertEquals(test.getSavingWithdraw(), test.getSavingBalance(),0);

        //test overdraft
        assertEquals(test.getAmount(), test.getOVERDRAFT(), test.getAmount()+100);
    }


}
