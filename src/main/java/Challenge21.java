public class Challenge21 {
    public static void Countdown(int seconds) {
        if (seconds != -1) {
            System.out.println(seconds);
            Countdown(seconds-1);
        }
    }

    public static void main(String[] args) {
        Countdown(10);
    }
}
