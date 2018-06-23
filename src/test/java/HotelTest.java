import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    ConferenceRoom conferenceRoom1;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void setUp(){
        hotel = new Hotel("Tara Towers");
        bedroom1 = new Bedroom(2, 4, "Basic",90);
        hotel.addRoom(bedroom1);
        guest1 = new Guest("Campbelle", 100);
        guest2 = new Guest("Richard", 5);
    }

    @Test
    public void hotelHasName(){
        assertEquals("Tara Towers", hotel.getName());
    }

    @Test
    public void canAddRoomtoHotel(){
        assertEquals(1, hotel.countRooms());
    }

    @Test
    public void countHotelGuests(){
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest2);
        assertEquals(2, hotel.countHotelGuests());
    }

    @Test
    public void checkHotelIsEmpty(){
        assertEquals(true, hotel.checkIfEmpty());
    }

    @Test
    public void hotelCanCheckGuestsIn(){
        hotel.checkGuestIn(guest1, bedroom1);
        assertEquals(1, bedroom1.countGuests());
    }

    @Test
    public void cantCheckPoorGuestIn(){
        hotel.checkGuestIn(guest2, bedroom1);
        assertEquals(0,bedroom1.countGuests());
    }

    @Test
    public void canCheckGuestOut(){
        hotel.checkGuestIn(guest1, bedroom1);
        hotel.checkGuestsOut(bedroom1);
        assertEquals(0, bedroom1.countGuests());
    }
}
