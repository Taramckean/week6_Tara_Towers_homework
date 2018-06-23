import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Room> roomCollection;

    public Hotel(String name) {
        this.name = name;
        this.roomCollection = new ArrayList<Room>();
    }

    public String getName() {
        return this.name;
    }

    public void addRoom(Bedroom bedroom1) {
        this.roomCollection.add(bedroom1);
    }

    public int countRooms() {
        return this.roomCollection.size();
    }

    public boolean checkIfEmpty() {
        for (Room room : roomCollection)
            if (room.countGuests() < 1) {
                return true;
            }
        {
            return false;
        }
    }

    public int countHotelGuests() {
        int counter = 0;
        for (Room room : roomCollection) {
            counter += room.countGuests();
        }
        return counter;
    }


    public void checkGuestIn(Guest guest, Bedroom bedroom) {
        if (guest.countMoney() >= bedroom.getNightlyRate()) {
            guest.money -= bedroom.getNightlyRate();
            bedroom.addGuest(guest);
        }
    }

    public void checkGuestsOut(Bedroom bedroom) {
        bedroom.removeGuests();
    }



}


