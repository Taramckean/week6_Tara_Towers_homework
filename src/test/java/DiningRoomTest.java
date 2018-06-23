import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    DiningRoom diningRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;

    @Before
    public void setUp(){
        diningRoom = new DiningRoom(3);
        guest1 = new Guest("Tara", 100);
        guest2 = new Guest("Richard", 80);
        guest3 = new Guest("Campbelle", 90);
        guest4 = new Guest("Louise", 150);
        diningRoom.addGuest(guest1);
        diningRoom.addGuest(guest2);
        diningRoom.addGuest(guest3);

    }

    @Test
    public void canGetCapacity(){
        assertEquals(3, diningRoom.getCapacity());
    }


    @Test
    public void canCountGuests(){
        assertEquals(3, diningRoom.countGuests());
    }

    @Test
    public void canRemoveGuest(){
        diningRoom.removeGuests();
        assertEquals(0, diningRoom.countGuests());
    }


    @Test
    public void cantAddGuestsOverCapacity(){
        diningRoom.addGuest(guest4);
        assertEquals(3, diningRoom.countGuests());
    }

    @Test
    public void canGetListOfGuestsInRoom(){
        assertEquals("Tara, Richard, Campbelle", diningRoom.guestList());
    }

}
