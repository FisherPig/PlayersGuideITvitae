public class Challenge6 {
    public static void main(String[] args) {
        byte byteMin = -128;
        byte byteMax = 127;
        short shortMin = -32768;
        short shortMax = 32767;
        int intMin = -2147483648;
        int intMax = 2147483647;
        long longMin = -9223372036854775808L;
        long longMax = 9223372036854775807L;
        float floatExample = 0.1234567f;
        double doubleExample = 0.1234567891011121;
        boolean booleanExample = true;
        char charExample = 165;
        System.out.println("Java has all kind of variables. Most of them store numbers of a kind.");
        System.out.println();
        System.out.println("Whole numbers are done with the byte, short, int, and long variables.");
        System.out.println("Byte ranges from " + byteMin + " to " + byteMax);
        System.out.println("Short ranges from " + shortMin + " to " + shortMax);
        System.out.println("Int ranges from " + intMin + " to " + intMax);
        System.out.println("Long ranges from " + longMin + " to " + longMax);
        System.out.println();
        System.out.println("Then we get to fractional numbers, represented by floats and doubles.");
        System.out.println("A float can store up to around 7 decimals, like " + floatExample);
        System.out.println("Meanwhile a double can do nearly twice that, like " + doubleExample);
        System.out.println();
        System.out.println("Boolean values only denote a true or false state. Example: I am currently hard at work learning Java = " + booleanExample);
        System.out.println();
        System.out.println("Lastly, char denotes single characters, and thus can only contain a single character, be it in text or ASCII. An ASCII char could for example show " + charExample);
    }
}
