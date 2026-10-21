public class Exercise1_6 {
    public static void main(String[] args) {
        double tankCapacity = 40.0;
        double normalConsumption = 8.0;

        double roughConsumption = normalConsumption * 1.15;

        double normalDistance = (tankCapacity / normalConsumption) * 100;
        double roughDistance = (tankCapacity / roughConsumption) * 100;

        System.out.printf("On normal roads, distance on full tank: %.2f km%n", normalDistance);
        System.out.printf("On rough roads, distance on full tank:  %.2f km%n", roughDistance);
    }
}