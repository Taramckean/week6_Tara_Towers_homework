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
        guest1 = new Guest("Campbelle");
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
        assertEquals(1, hotel.countHotelGuests());
    }

    @Test
    public void checkHotelIsEmpty(){
        assertEquals(true, hotel.checkIfEmpty());
    }

//    @Test
//    public void hotelCanCheckGuestsIn(){
//        hotel.checkGuestIn(bedroom1.addGuest(guest1);
//        assertEquals(1, bedroom1.countGuests());
//    }
}
