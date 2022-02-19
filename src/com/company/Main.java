package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        byte byteVar = 127;
        long longVar = 100;
        char charVar = 'a';
        double doubleVar = 2.9;
        boolean boolVar = true;
        int intVar = byteVar;
        int intVar2 = (int) longVar;

        int a = 13;
        int b = 4;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a++ = " + (a++));
        System.out.println("a = " + a);
        System.out.println("a-- = " + (a--));
        System.out.println("a = " + a);
        System.out.println("++a = " + (++a));
        System.out.println("a = " + a);
        System.out.println("--a = " + (--a));
        System.out.println("a = " + a);

        System.out.println("1 == 1 " + (1 == 1));
        System.out.println("1 == 2 " + (1 == 2));
        System.out.println("1 != 1 " + (1 != 2));
        System.out.println("1 != 1 " + (1 != 1));
        System.out.println("1 < 2 " + (1 < 2));
        System.out.println("1 > 2 " + (1 > 2));

        System.out.println("1 & 1 = " + (1 & 1));
        System.out.println("1 | 1 = " + (1 | 1));
        System.out.println("1 ^ 1 = " + (1 ^ 1));
        System.out.println(" ~1 =" + (~1));

        System.out.println("Логическое Правда И Правда = " + ((1 == 1) && (2 == 2)));
        System.out.println("Логическое Ложь И Правда = " + ((2 == 1) && (1 == 1)));
        System.out.println("Логическое Правда И Правда = " + ((1 == 1) || (2 == 2)));
        System.out.println("Логическое Правда И Ложь = " + ((1 == 1) || (2 == 1)));
        System.out.println("Логическое отрицание Не Правда = " + (!(1 == 1)));
        System.out.println("Логическое отрицание Не Ложь = " + (!(1 == 2)));

        int c = 10;
        System.out.println("c = " + c);
        c += 5;
        System.out.println("c += 5 = " + c);
        c -= 3;
        System.out.println("c -= 3 = " + c);
        c *= 2;
        System.out.println("c *= 2 = " + c);
        c /= 2;
        System.out.println("cc /= 2 = " + c);

        int d = (c < a) ? 1 : 0;
        System.out.println("(10 < 13) ? 1 : 0 = " +d);

        byte testByte = -128;

        byte reversedByteVar = (byte) ~testByte;
        System.out.println("byteVar = " + testByte +
                " b = " + Integer.toBinaryString(testByte));
        System.out.println("~byteVar = " + reversedByteVar +
                " b = " +  Integer.toBinaryString(reversedByteVar));
    }
}
