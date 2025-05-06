import java.util.Scanner;
public class Challenge9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many chocolate eggs have been gathered today?");
        int eggsGathered = input.nextInt();
        int eggsPerSister = eggsGathered / 4;
        int eggsLeftoverNumber = eggsGathered % 4;
        System.out.println("Each sister gets " + eggsPerSister + " and the duckbear gets the remaining " + eggsLeftoverNumber);
    }
}
