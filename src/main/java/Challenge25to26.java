public class Challenge25to26 {

    static class Arrow {
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

        private Arrowhead getArrowhead() {
            return arrowhead;
        }

        private Fletching getFletching() {
            return fletching;
        }

        private int getLength() {
            return length;
        }

        private final String arrowheadString = Inputs.askForStringCaps("What material arrowhead would you like?");
            private final Arrowhead arrowhead = Arrowhead.valueOf(arrowheadString);
        private final String fletchingString = Inputs.askForStringCaps("And what kind of feather should the fletching be made of?");
            private final Fletching fletching = Fletching.valueOf(fletchingString);
        private final int length = Inputs.askForNumberInRange("And how many centimeters should your arrow be?", 60, 100);
    }

    private static float getCost(){
        Arrow newArrow = new Arrow();
        float arrowheadCost;
        float fletchingCost;
        arrowheadCost = switch (newArrow.getArrowhead()) {
            case STEEL -> 10;
            case WOOD -> 3;
            case OBSIDIAN -> 5;
        };
        fletchingCost = switch (newArrow.getFletching()) {
            case PLASTIC -> 10;
            case TURKEY -> 5;
            case GOOSE -> 3;
        };
        float lengthCost = (float) (newArrow.getLength() * 0.05);
        float totalCost = arrowheadCost + fletchingCost + lengthCost;
        System.out.println("There you go, an arrow that's " + newArrow.getLength() + " centimeters long, with a " + newArrow.getArrowhead() + " arrowhead and a " + newArrow.getFletching() + " feather for the fletching!");
        return totalCost;
    }

    public static void main(String[] args) {
        System.out.println("That will cost you " + getCost() + " gold.");
    }
}