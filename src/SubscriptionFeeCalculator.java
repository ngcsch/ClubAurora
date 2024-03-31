public class SubscriptionFeeCalculator {
    public static double calculateSubscriptionFee(String membership) {
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

    private static double calculateFee(int base, float multiplier, float discount) {
        return (base * multiplier) - ((base/2) * discount);
    }
}