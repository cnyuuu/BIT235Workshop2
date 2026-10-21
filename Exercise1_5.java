public class Exercise1_5 {
    public static void main(String[] args) {
        double sunDiameter = 865000.0;
        double earthDiameter = 7600.0;
        double pi = 3.14;

        double earthRadius = earthDiameter / 2;
        double sunRadius = sunDiameter / 2;

        double earthVolume = (4.0 / 3.0) * pi * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3.0) * pi * Math.pow(sunRadius, 3);
        double ratio = sunVolume / earthVolume;

        System.out.println("a.) Volume of the Earth: " + earthVolume + " cubic miles");
        System.out.println("b.) Volume of the Sun:   " + sunVolume + " cubic miles");
        System.out.println("c.) Ratio of Sun to Earth volume: " + ratio);
    }
}