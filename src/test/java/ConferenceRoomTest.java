import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;
    Guest guest1;

    @Before
    public void setUp(){
        conferenceRoom = new ConferenceRoom(100, "Blue Room", 150);
        guest1 = new Guest("Campbelle", 100);
        conferenceRoom.addGuest(guest1);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(100, conferenceRoom.getCapacity());
    }

    @Test
    public void canCountGuests(){
        assertEquals(1, conferenceRoom.countGuests());
    }

    @Test
    public void canGetName(){
        assertEquals("Blue Room", conferenceRoom.getName());
    }

    @Test
    public void canGetRate(){
        assertEquals(150, conferenceRoom.getDailyRate());
    }

    @Test
    public void canRemoveGuests(){
    conferenceRoom.removeGuests();
    assertEquals(0, conferenceRoom.countGuests());
    }

}
