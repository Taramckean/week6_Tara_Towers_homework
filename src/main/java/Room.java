import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int countGuests(){
        return this.guests.size();
    }

    public void addGuest(Guest guest){
        if (this.capacity > this.guests.size()){
        this.guests.add(guest);}

    }

    public void removeGuests(){
        this.guests.clear();
    }

    public String guestList() {
        ArrayList names = new ArrayList();
        for (Guest guest : guests) {
            names.add(guest.getName());
        }
        String result = names.toString();
        return result.replace("[", "").replace("]", "");


    }



}







