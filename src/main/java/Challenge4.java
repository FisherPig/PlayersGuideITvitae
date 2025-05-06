import java.util.Scanner;  // Import the Scanner class
public class Challenge4 {
    public static void main(String[] args) {
        System.out.println("Bread is ready.");
        Scanner input = new Scanner(System.in);
        System.out.println("Who is the Bread for?");
        String breadRecipient = input.nextLine();
        System.out.println("Noted: " + breadRecipient + " received bread.");
    }
}
