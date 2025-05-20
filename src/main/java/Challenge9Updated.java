import java.util.Scanner;

public class Challenge9Updated {
    public static void main(String[] args) {
        int eggsGathered = Challenge20.askForNumber("How many chocolate eggs have been gathered today?");
        int eggsPerSister = eggsGathered / 4;
        int eggsLeftoverNumber = eggsGathered % 4;
        System.out.println("Each sister gets " + eggsPerSister + " and the duckbear gets the remaining " + eggsLeftoverNumber);
    }
}