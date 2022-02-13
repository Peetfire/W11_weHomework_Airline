package People;

public class Passenger extends Person{
    private int noOfBags;
    private int bagWeight = 10;


    public Passenger(String name, int noOfBags) {
        super(name);
        this.noOfBags = noOfBags;
    }

    public int getNoOfBags() {
        return noOfBags;
    }

    public void setNoOfBags(int noOfBags) {
        this.noOfBags = noOfBags;
    }

    public int getTotalWeight(){
        return this.bagWeight * this.noOfBags;
    }
}
