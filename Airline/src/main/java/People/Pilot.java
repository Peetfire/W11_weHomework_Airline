package People;

public class Pilot extends CabinCrewMember{
    private String licenceNo;

    public Pilot(String name, Rank rank, String licenceNo) {
        super(name, rank);
        this.licenceNo = licenceNo;
    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }

    public String flyPlane() {
        return "Yippee, I'm flying! Look, no hands!";
    }
}
