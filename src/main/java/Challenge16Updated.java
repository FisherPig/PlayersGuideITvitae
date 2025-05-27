public class Challenge16Updated {
    public static void main(String[] args) {
        int correctNumber = Challenge20.askForNumberInRange("User 1, enter a number from 0 to 100: ", 0, 100);
        System.out.flush();
        int guessedNumber = Challenge20.askForNumber("User 2, guess the number.");
        while (guessedNumber != correctNumber) {
            if (guessedNumber < correctNumber) {
                System.out.println(guessedNumber + " is too low.");
            }
            if (guessedNumber > correctNumber) {
                System.out.println(guessedNumber + " is too high.");
            }
            guessedNumber = Challenge20.askForNumber("What is your next guess?");
        }
        System.out.println("You guessed the number!");
    }
}