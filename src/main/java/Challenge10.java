import java.util.Scanner;
public class Challenge10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many estates do you own?");
        int estateScore = input.nextInt();
        System.out.println("How many estates do you own?");
        int duchyScore = input.nextInt() * 3;
        System.out.println("How many estates do you own?");
        int provinceScore = input.nextInt() * 6;
        int kingdomScore = estateScore + duchyScore + provinceScore;
        System.out.println("Your total Kingdom Score comes to " + kingdomScore);
    }
}
