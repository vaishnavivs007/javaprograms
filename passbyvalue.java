public class passbyvalue
 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Before method call: " + num);
        modifyValue(num);
        System.out.println("After method call: " + num);
    }

    public static void modifyValue(int number) {
        number = 20;
        System.out.println("Inside method: " + number);
    }
}
