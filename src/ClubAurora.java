public class ClubAurora {
    public String clubID;
    private String memberFirstName;
    private String memberLastName;
    private String memberAddress;
    private String joiningDate;
    private String memberType;

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

    public double getSubscriptionFee() {
        return SubscriptionFeeCalculator.calculateSubscriptionFee(memberType);
    }
}