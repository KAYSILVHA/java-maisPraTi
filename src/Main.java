import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        byte byteVar = 127;
        short shortVar = 32000;
        int intVar = 21000000;
        long longVar = 9000000000000000000L;
        float floatVar = 3.14F;
        double doubleVar = 3.141359265;
        char charVar = 'A';
        boolean booleanVar = true;
        String name = "Kay";

        System.out.println("Hello World!");
        // fazer um pra cada variavel
        // System.out.println("Byte: " + byteVar);
        // ...

        System.out.printf("%.2f\n" , floatVar);

        Locale.setDefault(Locale.US);
    }
}