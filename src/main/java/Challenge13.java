import java.util.Scanner;
public class Challenge13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What X coordinate is the enemy at?");
        int enemyX = input.nextInt();
        System.out.println("And what Y coordinate?");
        int enemyY = input.nextInt();
        System.out.print("The enemy is ");
        if (enemyY == 0) if (enemyX == 0) {
            System.out.println("here!");
        }
        if (enemyY > 0) {
            System.out.print("north");
        } else if (enemyY < 0) {
            System.out.print("south");
        }
        if (enemyX > 0) {
            System.out.print("east");
        } else if (enemyX < 0) {
            System.out.print("west");
        }
        if (enemyY != 0 || enemyX != 0) {
            System.out.print(" of us!");
        }
    }
}
