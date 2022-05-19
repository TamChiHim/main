public class BuiltinType {
    public static void main(String[] args) {

        new BuiltinType().runApp();
    }

    void runApp() {

        System.out.println("Size of byte in Java: " + Byte.SIZE + " bits");
        System.out.println("Minimum value: " + Byte.MIN_VALUE);
        System.out.println("Maximum value: " + Byte.MAX_VALUE);
        System.out.println();
        System.out.println("Size of short in Java: " + Short.SIZE + " bits");
        System.out.println("Minimum value: " + Short.MIN_VALUE);
        System.out.println("Maximum value: " + Short.MAX_VALUE);
        System.out.println();

        System.out.println("Size of int in Java: " + Integer.SIZE + " bits");
        System.out.println("Minimum value: " + Integer.MIN_VALUE);
        System.out.println("Maximum value: " + Integer.MAX_VALUE);
        System.out.println();

        System.out.println("Size of long in Java: " + Long.SIZE + " bits");
        System.out.println("Minimum value: " + Long.MIN_VALUE);
        System.out.println("Maximum value: " + Long.MAX_VALUE);
        System.out.println();

        System.out.println("Size of float in Java: " + Float.SIZE + " bits");
        System.out.println();

        System.out.println("Size of double in Java: " + Double.SIZE + " bits");
        System.out.println();


    }

}




