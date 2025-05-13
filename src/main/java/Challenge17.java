public class Challenge17 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {
        int crank = 1;
        while (crank <= 100) {
            if (crank % 3 == 0 && crank % 5 == 0) {
                System.out.println(ANSI_BLUE + crank + ": Fire and Electric" + ANSI_RESET);
            } else if (crank % 3 == 0) {
                System.out.println(ANSI_RED + crank + ": Fire" + ANSI_RESET);
            } else if (crank % 5 == 0) {
                System.out.println(ANSI_YELLOW + crank + ": Electric" + ANSI_RESET);
            } else
                System.out.println(crank + ": Normal");
            crank++;
        }
    }
}
