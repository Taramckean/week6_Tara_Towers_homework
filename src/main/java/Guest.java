public class Guest {
    private String name;
    private int money;

    public Guest(String name, int money){
        this.name = name;
        this.money = money;
    }

    public String getName(){
        return this.name;
    }


    public int countMoney() {
        return this.money;
    }


}

