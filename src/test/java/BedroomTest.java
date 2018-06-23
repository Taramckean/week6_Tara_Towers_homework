import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void setUp() {
        bedroom = new Bedroom(2, 4, "Luxury", 80);
        guest1 = new Guest("Tara", 100);
        guest2 = new Guest("Richard", 80);
        guest3 = new Guest("Campbelle", 90);
        bedroom.addGuest(guest1);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void canGetNumber(){
        assertEquals(4, bedroom.getNumber());
    }

    @Test
    public void canGetType(){
        assertEquals("Luxury", bedroom.getType());
    }

    @Test
    public void canGetNightlyRate(){
        assertEquals(80, bedroom.getNightlyRate());
    }

    @Test
    public void canCountGuests(){
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void canRemoveGuest(){
        bedroom.removeGuests();
        assertEquals(0, bedroom.countGuests());
    }

    @Test
    public void canAddMultipleGuests(){
        bedroom.addGuest(guest2);
        assertEquals(2, bedroom.countGuests());
    }

    @Test
    public void cantAddGuestsOverCapacity(){
        bedroom.addGuest(guest2);
        bedroom.addGuest(guest3);
        assertEquals(2, bedroom.countGuests());
    }

}
