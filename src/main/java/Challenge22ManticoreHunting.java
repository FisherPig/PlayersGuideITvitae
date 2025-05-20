public class Challenge22ManticoreHunting {
    public static int damageDone(int round) {
        int damageDone;
        if (round % 3 == 0 && round % 5 == 0) {
            damageDone = 10;
        } else if (round % 3 == 0 || round % 5 == 0) {
            damageDone = 3;
        } else
            damageDone = 1;
        return damageDone;
    }

    public static void hitOrMiss(int guessNumber, int correctNumber) {
        if (guessNumber < correctNumber) {
            System.out.println("That round FELL SHORT of the target.");
        } else if (guessNumber > correctNumber) {
            System.out.println("That round OVERSHOT the target.");
        } else {
            System.out.println("That round was a DIRECT HIT!");
        }
    }

    public static String statusReport(int round, int cityHP, int manticoreHP, int correctNumber) {
        while (manticoreHP > 0 && cityHP > 0) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("STATUS: Round: " + round + "  City: " + cityHP + "/15  Manticore: " + manticoreHP + "/10");
        System.out.println("The cannon is expected to deal " + damageDone(round) + " damage this round.");
        int guessNumber = Challenge20.askForNumber("Enter desired cannon range: ");
        hitOrMiss(guessNumber, correctNumber);
        if (guessNumber == correctNumber) {
            manticoreHP -= damageDone(round);
            }
        if (manticoreHP > 0) {
            round++;
            cityHP--;
            return statusReport(round, cityHP, manticoreHP, correctNumber);
            }
        } if (manticoreHP <= 0) {
            System.out.println("The Manticore has been destroyed! The city of Consolas has been saved!");
        } else if (cityHP == 0) {
            System.out.println("The city of Consolas has been destroyed! All is lost...");
        }
        return "";
    }
}