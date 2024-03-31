public class Main {
    public static void main(String[] args) {

        ClubAurora clubA = new ClubAurora("CZAXX234TGF", "Alfred", "Hitchcock", "Winewood Av., New York City, NY", "August 13, 1987", "Monthly");
        System.out.println("The member " + clubA.getFirstName() + " " + clubA.getLastName() + " has a " + clubA.getMembership() +
                " membership and must pay a monthly subscription fee of: €" + clubA.getSubscriptionFee());

        ClubAurora clubB = new ClubAurora("CZAXX567UVB", "Charlie", "Chaplin", "Sunset Blvd., Los Angeles, CA", "January 01, 1990", "Half yearly");
        System.out.println("The member " + clubB.getFirstName() + " " + clubB.getLastName() + " has a " + clubB.getMembership() +
                " membership and must pay a half-yearly subscription fee of: €" + clubB.getSubscriptionFee());

        ClubAurora clubC = new ClubAurora("CZAXX890WXY", "David", "Lynch", "Mulholland Dr., Los Angeles, CA", "July 04, 1995", "Yearly");
        System.out.println("The member " + clubC.getFirstName() + " " + clubC.getLastName() + " has a " + clubC.getMembership() +
                " membership and must pay a yearly subscription fee of: €" + clubC.getSubscriptionFee());

        ClubAurora clubD = new ClubAurora("CZAXX123ZAB", "Wes", "Anderson", "Lincoln Blvd., Los Angeles, CA", "December 25, 2000", "Lifetime");
        System.out.println("The member " + clubD.getFirstName() + " " + clubD.getLastName() + " has a " + clubD.getMembership() +
                " membership and must pay a lifetime subscription fee of: €" + clubD.getSubscriptionFee());
    }
}