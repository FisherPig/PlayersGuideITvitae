import java.util.Scanner;

public class Challenge16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("User 1, enter a number from 0 to 100: ");
        int correctNumber = input.nextInt();
        while (correctNumber > 100 || correctNumber < 0) {
            System.out.println("Inputted number not valid. Please enter a number from 0 to 100.");
            correctNumber = input.nextInt();
        }
        System.out.flush();
        System.out.println("User 2, guess the number.");
        int guessedNumber = input.nextInt();
        while (guessedNumber != correctNumber) {
            if (guessedNumber < correctNumber) {
                System.out.println(guessedNumber + " is too low.");
            }
            if (guessedNumber > correctNumber) {
                System.out.println(guessedNumber + " is too high.");
            }
            System.out.println("What is your next guess?");
            guessedNumber = input.nextInt();
        }
        System.out.println("You guessed the number!");
    }
}
