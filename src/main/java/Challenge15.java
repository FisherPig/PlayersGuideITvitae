import java.util.Objects;
import java.util.Scanner;

public class Challenge15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The following items are available:");
        System.out.println("1. Rope");
        System.out.println("2. Torches");
        System.out.println("3. Climbing Equipment");
        System.out.println("4. Clean Water");
        System.out.println("5. Machete");
        System.out.println("6. Canoe");
        System.out.println("7. Food Supplies");
        System.out.println();
        System.out.println("What is your name?");
        String customerName = input.nextLine();
        System.out.println("Which item would you like to purchase?");
        int item = input.nextInt();
        switch (item) {
            case 1:
                if (Objects.equals(customerName, "Pieter")) {
                System.out.println("Rope costs 5 gold.");
            } else {
                System.out.println("Rope costs 10 gold.");
            }
                break;
            case 2:
                if (Objects.equals(customerName, "Pieter")) {
                    System.out.println("Torches cost 7,5 gold.");
                } else {
                    System.out.println("Torches cost 15 gold.");
                }
                break;
            case 3:
                if (Objects.equals(customerName, "Pieter")) {
                    System.out.println("Climbing Equipment costs 12,5 gold.");
                } else {
                    System.out.println("Climbing Equipment costs 25 gold.");
                }
                break;
            case 4:
                if (Objects.equals(customerName, "Pieter")) {
                    System.out.println("Clean Water costs 0,5 gold.");
                } else {
                    System.out.println("Clean Water costs 1 gold.");
                }
                break;
            case 5:
                if (Objects.equals(customerName, "Pieter")) {
                    System.out.println("Machetes cost 10 gold.");
                } else {
                    System.out.println("Machetes cost 20 gold.");
                }
                break;
            case 6:
                if (Objects.equals(customerName, "Pieter")) {
                    System.out.println("Canoes cost 100 gold.");
                } else {
                    System.out.println("Canoes cost 200 gold.");
                }
                break;
            case 7:
                if (Objects.equals(customerName, "Pieter")) {
                    System.out.println("Food Supplies cost 0,5 gold.");
                } else {
                    System.out.println("Food Supplies cost 1 gold.");
                }
                break;
        }
    }
}
