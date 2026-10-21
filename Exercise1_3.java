public class Exercise1_3 {
    public static void main(String[] args) {
        double[] radii = {3.0, 5.5, 10.0, 2.5};

        for (double radius : radii) {
            double area = 3.14 * Math.pow(radius, 2);
            System.out.println("Radius = " + radius + " → Area = " + area);
        }
    }
}