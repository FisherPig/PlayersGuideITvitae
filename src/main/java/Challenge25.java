import java.util.Scanner;

public class Challenge25 {

    enum Arrowhead {
        STEEL,
        WOOD,
        OBSIDIAN
    }

    enum Fletching {
        PLASTIC,
        TURKEY,
        GOOSE
    }

    private static float getCost(Arrowhead arrowhead, Fletching fletching, int length){
        float arrowheadCost;
        float fletchingCost;
        arrowheadCost = switch (arrowhead) {
            case STEEL -> 10;
            case WOOD -> 3;
            case OBSIDIAN -> 5;
        };
        fletchingCost = switch (fletching) {
            case PLASTIC -> 10;
            case TURKEY -> 5;
            case GOOSE -> 3;
        };
        float lengthCost = (float) (length * 0.05);
        return arrowheadCost + fletchingCost + lengthCost;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What material arrowhead would you like?");
        String arrowheadString = input.nextLine();
        arrowheadString = arrowheadString.toUpperCase();
        Arrowhead NewArrowhead = Arrowhead.valueOf(arrowheadString);
        System.out.println("And what kind of feather should the fletching be made of?");
        String fletchingString = input.nextLine();
        fletchingString = fletchingString.toUpperCase();
        Fletching NewFletching = Fletching.valueOf(fletchingString);
        int NewLength = Challenge20.askForNumberInRange("And how many centimeters should your arrow be?", 60, 100);
        System.out.println("There you go, a " + NewLength + " centimeter long arrow with a " + NewArrowhead + " arrowhead and a " + NewFletching + " feather for the fletching!");
        float NewCost = getCost(NewArrowhead, NewFletching, NewLength);
        System.out.println("That will cost you " + NewCost + " gold.");
    }
}