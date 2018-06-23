import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void setUp(){
        guest = new Guest("Tara", 100);
    }

    @Test
    public void canGetName(){
        assertEquals("Tara", guest.getName());
    }

    @Test
    public void canCountMoney(){
        assertEquals(100, guest.countMoney());
    }
}

