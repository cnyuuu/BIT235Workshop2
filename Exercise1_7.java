public class Exercise1_7 {
    public static void main(String[] args) {
        String s = "I love java programming";
        String result = s.substring(7, 11);

        System.out.println("Original string: \"" + s + "\"");
        System.out.println("substring(7, 11) = \"" + result + "\"");
        System.out.println("Length of returned string: " + result.length());
    }
}