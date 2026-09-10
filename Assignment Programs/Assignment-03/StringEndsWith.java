package stringmethods;
class EndsWithExample {
    public static void main(String[] args) {
        String str = "Hello Java";

        boolean result = str.endsWith("Java");

        System.out.println("String: " + str);
        System.out.println("Ends with Java? " + result);
    }
}
