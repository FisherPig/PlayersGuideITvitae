public class Challenge25Original {

    private enum Arrowhead {
        STEEL,
        WOOD,
        OBSIDIAN
    }

    private enum Fletching {
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
        String arrowheadString = Inputs.askForStringCaps("What material arrowhead would you like?");
            Arrowhead NewArrowhead = Arrowhead.valueOf(arrowheadString);
        String fletchingString = Inputs.askForStringCaps("And what kind of feather should the fletching be made of?");
            Fletching NewFletching = Fletching.valueOf(fletchingString);
        int NewLength = Inputs.askForNumberInRange("And how many centimeters should your arrow be?", 60, 100);
        System.out.println("There you go, an arrow that's " + NewLength + " centimeters long, with a " + NewArrowhead + " arrowhead and a " + NewFletching + " feather for the fletching!");
        float NewCost = getCost(NewArrowhead, NewFletching, NewLength);
        System.out.println("That will cost you " + NewCost + " gold.");
    }
}