import java.util.Objects;
import java.util.Scanner;

public class Challenge23 {
    enum Chest {
        OPEN,
        CLOSED,
        LOCKED
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Chest state = Chest.LOCKED;
        while (true) {
            System.out.println("The chest is currently " + state + ". What do you want to do?");
            String action = input.nextLine();
            action = action.toUpperCase();
            if (state == Chest.CLOSED && Objects.equals(action, "OPEN")) {
                System.out.println("You OPEN the chest.");
                state = Chest.OPEN;
            } else if (state == Chest.OPEN && Objects.equals(action, "CLOSE")) {
                System.out.println("You CLOSE the chest.");
                state = Chest.CLOSED;
            } else if (state == Chest.LOCKED && Objects.equals(action, "UNLOCK")) {
                System.out.println("You UNLOCK the chest.");
                state = Chest.CLOSED;
            } else if (state == Chest.CLOSED && Objects.equals(action, "LOCK")) {
                System.out.println("You LOCK the chest.");
                state = Chest.LOCKED;
            } else System.out.println("Invalid input: Try again");
        }
    }
}