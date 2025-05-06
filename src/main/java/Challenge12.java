import java.util.Scanner;
public class Challenge12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What number does the clock show?");
        int clockNumberLeftover = input.nextInt() % 2;
        if (clockNumberLeftover == 0) {
            System.out.println("Tick");
        } else {
            System.out.println("Tock");
        }
    }
}
