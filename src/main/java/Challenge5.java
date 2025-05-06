import java.util.Scanner;
public class Challenge5 {
    public static void main(String[] args) {
        System.out.println("What kind of thing are we talking about?");
        Scanner input = new Scanner(System.in);
        String a = input.next(); //Name of the "thing"
        System.out.println("How would you describe it? Big? Azure? Tattered?");
        String b = input.next(); //Adjective of the "thing"
        String c = "of Doom"; //Describes the "thing" as a thing of Doom
        String d = "3000"; /*Adds the number 3000 to the name of the thing, regardless of whether it is the 3000th thing or not*/
        System.out.println("The " + b + " " + a + " " + c + " " + d + "!");
    }
}

//I would probably rename the variables. Strings a, b, c and d are not particularly readable.
//String a could be renamed to something like "thingName" and String b to "thingAdjective"
