import java.util.Scanner;

public class Challenge14 {
    public static void main(String[] args) {
        System.out.println("The following items are available:");
        System.out.println("1. Rope");
        System.out.println("2. Torches");
        System.out.println("3. Climbing Equipment");
        System.out.println("4. Clean Water");
        System.out.println("5. Machete");
        System.out.println("6. Canoe");
        System.out.println("7. Food Supplies");
        System.out.println();
        System.out.println("Which item would you like to purchase?");
        Scanner input = new Scanner(System.in);
        int item = input.nextInt();
        switch (item) {
            case 1:
                System.out.println("Rope costs 10 gold.");
                break;
            case 2:
                System.out.println("Torches cost 15 gold.");
                break;
            case 3:
                System.out.println("Climbing Equipment costs 25 gold.");
                break;
            case 4:
                System.out.println("Clean Water costs 1 gold.");
                break;
            case 5:
                System.out.println("Machetes cost 20 gold.");
                break;
            case 6:
                System.out.println("Canoes cost 200 gold.");
                break;
            case 7:
                System.out.println("Food Supplies cost 1 gold.");
                break;
        }
    }
}
