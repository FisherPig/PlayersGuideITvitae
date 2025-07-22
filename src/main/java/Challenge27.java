public class Challenge27 {

    static class Arrow {
        private enum Arrowhead {STEEL, WOOD, OBSIDIAN}

        private enum Fletching {PLASTIC, TURKEY, GOOSE}

        private Arrowhead getArrowhead() {
            return arrowhead;
        }

        private void setArrowhead(Arrowhead arrowhead) {
            this.arrowhead = arrowhead;
        }

        private Fletching getFletching() {
            return fletching;
        }

        private void setFletching(Fletching fletching) {
            this.fletching = fletching;
        }

        private int getLength() {
            return length;
        }

        private void setLength(int length) {
            this.length = length;
        }

        private static Arrow createEliteArrow(){
            Arrow newArrow = new Arrow();
            newArrow.setArrowhead(Arrowhead.STEEL);
            newArrow.setFletching(Fletching.PLASTIC);
            newArrow.setLength(95);
            return newArrow;
        }

        private static Arrow createBeginnerArrow(){
            Arrow newArrow = new Arrow();
            newArrow.setArrowhead(Arrowhead.WOOD);
            newArrow.setFletching(Fletching.GOOSE);
            newArrow.setLength(75);
            return newArrow;
        }

        private static Arrow createMarksmanArrow(){
            Arrow newArrow = new Arrow();
            newArrow.setArrowhead(Arrowhead.STEEL);
            newArrow.setFletching(Fletching.GOOSE);
            newArrow.setLength(65);
            return newArrow;
        }

        Arrowhead arrowhead;
        Fletching fletching;
        int length;
    }

    private static float getCost(){
        Arrow newArrow = null;

        String arrowType = Inputs.askForStringCaps("Pick from one of the following arrow types: ELITE, BEGINNER, MARKSMAN or CUSTOM");
        if (!arrowType.equals("CUSTOM")) {
            switch (arrowType) {
                case "ELITE" -> newArrow = Arrow.createEliteArrow();
                case "BEGINNER" -> newArrow = Arrow.createBeginnerArrow();
                case "MARKSMAN" -> newArrow = Arrow.createMarksmanArrow();
            }
        } else {
            newArrow = new Arrow();
            String arrowheadString = Inputs.askForStringCaps("What material arrowhead would you like?");
            newArrow.setArrowhead(Arrow.Arrowhead.valueOf(arrowheadString));
            String fletchingString = Inputs.askForStringCaps("And what kind of feather should the fletching be made of?");
            newArrow.setFletching(Arrow.Fletching.valueOf(fletchingString));
            newArrow.setLength(Inputs.askForNumberInRange("And how many centimeters should your arrow be?", 60, 100));
        }

        float arrowheadCost = switch (newArrow.getArrowhead()) {
            case STEEL -> 10;
            case WOOD -> 3;
            case OBSIDIAN -> 5;
        };
        float fletchingCost = switch (newArrow.getFletching()) {
            case PLASTIC -> 10;
            case TURKEY -> 5;
            case GOOSE -> 3;
        };
        float lengthCost = (float) (newArrow.getLength() * 0.05);
        System.out.println("There you go, an arrow that's " + newArrow.getLength() + " centimeters long, with a " + newArrow.getArrowhead() + " arrowhead and a " + newArrow.getFletching() + " feather for the fletching!");
        return arrowheadCost + fletchingCost + lengthCost;
    }

    public static void main(String[] args) {
        System.out.println("That will cost you " + getCost() + " gold.");
    }
}