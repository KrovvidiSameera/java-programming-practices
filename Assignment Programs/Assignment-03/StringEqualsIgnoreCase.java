package stringmethods;
class EqualsIgnoreCaseExample {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "JAVA";

        boolean result = str1.equalsIgnoreCase(str2);

        System.out.println("First String: " + str1);
        System.out.println("Second String: " + str2);
        System.out.println("Are they equal? " + result);
    }
}
