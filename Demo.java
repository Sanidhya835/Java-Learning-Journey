// public class Demo {
//     public static void main(String[] args) {
//         System.out.println("Hello World!");
//     }
// }

public class Demo {
    public static void main(String[] args) {
        // Integer --> byte, short, int, long
        // byte b = 5;
        // byte b = 0b101; // binary representation of 5
        // byte b = 07; // 0 - 7 --> octal
        byte b = 0x5; // 0 - 9, A - F --> hexadecimal
        short s = 10;
        int i = 4000;
        long l = 100000;

        // Real --> float, double
        float f = 10.55f;
        double d = 23.0982;

        // Character --> char
        char c = 'a'; // 'a' --> integer --> binary --> store

        // Boolean --> boolean
        boolean bool = false;

        System.out.println("Integer values -->" + b + " " + s + " " + i + " " + l);
        System.out.println("Real values -->" + f + " " + d);
        System.out.println("Character value -->" + c);
        System.out.println("Boolean value -->" + bool);

    }
}