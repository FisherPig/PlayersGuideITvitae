public class Challenge7 {
    public static void main(String[] args) {
        byte byteMin = -54;
        byte byteMax = 111;
        short shortMin = -12345;
        short shortMax = 21346;
        int intMin = -1234567890;
        int intMax = 1234567890;
        long longMin = -987654321000004444L;
        long longMax = 5334299291093234234L;
        float floatExample = 0.1509085f;
        double doubleExample = 0.9364084503813911;
        boolean booleanExample = false;
        char charExample = 166;
        System.out.println("ATTENTION: The following statements may be FALSE. They have been altered for demonstrative purposes.");
        System.out.println();
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
