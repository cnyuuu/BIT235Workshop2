public class Exercise1_4 {
    public static void main(String[] args) {
        double P = 5000.00;
        double r = 0.04;
        int n = 10;

        double A = P * Math.pow(1 + r, n);

        System.out.println("Principal: $" + P);
        System.out.println("Annual interest rate: " + (r * 100) + "%");
        System.out.println("Number of years: " + n);
        System.out.printf("Compound amount after %d years: $%.2f%n", n, A);
    }
}