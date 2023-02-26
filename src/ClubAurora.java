public class ClubAurora {
    public String clubID;
    private String memberFirstName;
    private String memberLastName;
    private String memberAddress;
    private String joiningDate;
    private String memberType;
    //private double subscriptionFee;

    public ClubAurora(String id, String firstName, String lastName, String address, String joined, String membership) {
        this.clubID = id;
        this.memberFirstName = firstName;
        this.memberLastName = lastName;
        this.memberAddress = address;
        this.joiningDate = joined;
        this.memberType = membership;
    }

    public String getClubID() {
        return clubID;
    }

    public String getFirstName() {
        return memberFirstName;
    }

    public String getLastName() {
        return memberLastName;
    }

    public String getAddress() {
        return memberAddress;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public String getMembership() {
        return memberType;
    }

    public double getSubscriptionFee(String membership) {
        double fees = 0;
        switch(membership){
            case "Monthly":
            fees = calculateFee(1000, 0.8f, 0.2f);
            break;
            case "Half yearly":
            fees = calculateFee(1500, 0.6f, 0.3f);
            break;
            case "Yearly":
            fees = calculateFee(1800, 0.45f, 0.4f);
            break;
            case "Lifetime":
            fees = calculateFee(3000, 0.35f, 0.45f);
            break;
        }
        return Math.round(fees);
    }

    private double calculateFee(int base, float multiplier, float discount) {
        return (base * multiplier) - ((base/2) * discount);
    }    
}
