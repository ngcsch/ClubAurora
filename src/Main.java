public class Main{
    public static void main(String[] args) {
        
        ClubAurora clubA = new ClubAurora("CZAXX234TGF", "Winewood Av., New York City, NY", 180, "Monthly");

        System.out.println("The registered member with " + clubA.getMemberType() + 
        " membership must pay a monthly subscription fee of: €" + clubA.getSubscriptionFee(clubA.getMemberType()));
        
        // --- TODO

        /* Repeat the above code to create as many objects for different types of member susbcription  
        */
        

    }
}




