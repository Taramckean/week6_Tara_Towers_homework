public class Guest {
    private String name;
    public int money;

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

