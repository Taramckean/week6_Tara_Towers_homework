public class Bedroom extends Room {

    private int roomNumber;
    private String type;
    private int nightlyRate;

    public Bedroom(int capacity, int roomNumber, String type, int nightlyRate){
        super(capacity);
        this.roomNumber = roomNumber;
        this.type = type;
        this.nightlyRate = nightlyRate;
    }

    public int getNumber() {
        return this.roomNumber;
    }


    public String getType() {
        return this.type;
    }


    public int getNightlyRate() {
        return this.nightlyRate;
    }

}
