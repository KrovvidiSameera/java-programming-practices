public class StringMethods {
    public static void main(String[] args) {

        String s = "Hello Java";

        System.out.println("Length: " + s.length());
        System.out.println("Char: " + s.charAt(1));
        System.out.println("Upper: " + s.toUpperCase());
        System.out.println("Lower: " + s.toLowerCase());
        System.out.println("Substring: " + s.substring(6));
        System.out.println("Replace: " + s.replace("Java", "World"));
        System.out.println("Contains: " + s.contains("Java"));
        System.out.println("Index: " + s.indexOf("Java"));
        System.out.println("Trim: " + "  Hello  ".trim());
    }
}
