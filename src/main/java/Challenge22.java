public class Challenge22 {
    public static void main(String[] args) {
        int manticoreLocation = Challenge20.askForNumberInRange("Player 1, how far away from the city do you want to station the Manticore?", 0, 100);
        System.out.flush();
        System.out.println("Player 2, it is your turn.");
        Challenge22ManticoreHunting.statusReport(1, 15, 10, manticoreLocation);
    }
}