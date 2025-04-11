public class stringref {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println("str1 == str2: " + (str1 == str2));

        String str3 = new String("Hello");
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
    }
}
