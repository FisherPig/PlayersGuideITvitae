import java.util.Scanner;

public class Challenge20 {
    public static int askForNumber(String text) {
        Scanner input = new Scanner(System.in);
        System.out.println(text);
        return input.nextInt();
    }

    public static int askForNumberInRange(String text, int min, int max) {
        Scanner input = new Scanner(System.in);
        System.out.println(text);
        int askForNumberInRange = input.nextInt();
        while (askForNumberInRange < min || askForNumberInRange > max){
            System.out.println("Input invalid. Please enter a value within the range of " + min + " to " + max + ".");
            System.out.println(text);
            askForNumberInRange = input.nextInt();
        }
        return askForNumberInRange;
    }

    public static void main(String[] args) {
        askForNumber("What is the airspeed velocity of an unladen swallow?");
        askForNumberInRange("How many fingers am I holding up?", 0, 10);
    }
}