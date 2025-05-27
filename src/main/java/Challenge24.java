import java.util.Scanner;

public class Challenge24 {
    enum Type {
        SOUP,
        STEW,
        GUMBO
    }

    enum MainIngredient {
        MUSHROOMS,
        CHICKEN,
        CARROTS,
        POTATOES
    }

    enum Seasoning {
        SPICY,
        SWEET,
        SALTY
    }

    private static void Soup(Type SoupTypeClass, MainIngredient SoupIngredientClass, Seasoning SoupSeasoningClass){
        System.out.println("There, I have made you " + SoupSeasoningClass + " " + SoupIngredientClass + " " + SoupTypeClass);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What type of soup do you want, " + Type.SOUP + ", " + Type.STEW + ", or " + Type.GUMBO + "?");
            String TypeString = input.nextLine();
            TypeString = TypeString.toUpperCase();
            Type SoupType = Type.valueOf(TypeString);
            System.out.println("And what ingredient should I use, " + MainIngredient.MUSHROOMS + ", " + MainIngredient.CHICKEN + ", " + MainIngredient.CARROTS + ", or " + MainIngredient.POTATOES + "?");
            String IngredientString = input.nextLine();
            IngredientString = IngredientString.toUpperCase();
            MainIngredient SoupIngredient = MainIngredient.valueOf(IngredientString);
        System.out.println("With what kind of seasoning, " + Seasoning.SPICY + ", " + Seasoning.SWEET + ", or " + Seasoning.SALTY + "?");
            String SeasonsString = input.nextLine();
            SeasonsString = SeasonsString.toUpperCase();
            Seasoning SoupSeasoning = Seasoning.valueOf(SeasonsString);
        Soup(SoupType, SoupIngredient, SoupSeasoning);
    }
}