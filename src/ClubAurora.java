public class ClubAurora {
    public String clubID;
    public String clubAddress;
    private int totalMembers;
    public int foundedOn;
    private String memberType;
    private double subscriptionFee;

    public ClubAurora(String id, String address, int totalmembers, String membership) {
        this.clubID = id;
        this.clubAddress = address;
        this.totalMembers = totalmembers;
        this.memberType = membership;
    }

    public String getClubID() {
        return clubID;
    }

    public String getClubAddress() {
        return clubAddress;
    }

    public int getTotalMembers() {
        return totalMembers;
    }

    public String getMemberType() {
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
