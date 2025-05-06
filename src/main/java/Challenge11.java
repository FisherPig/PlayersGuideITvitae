import java.awt.*;
import java.util.Scanner;
public class Challenge11 {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the row of the block being attacked?");
        int blockRow = input.nextInt();
        System.out.println("And the Column?");
        int blockColumn = input.nextInt();
        int defender1Row = blockRow + 1;
        int defender1Column = blockColumn;
        int defender2Row = blockRow;
        int defender2Column = blockColumn + 1;
        int defender3Row = blockRow - 1;
        int defender3Column = blockColumn;
        int defender4Row = blockRow;
        int defender4Column = blockColumn - 1;
        System.out.println("Deploy to:");
        System.out.println(ANSI_GREEN + "(" + defender1Row + "," + defender1Column + ")");
        System.out.println("(" + defender2Row + "," + defender2Column + ")");
        System.out.println("(" + defender3Row + "," + defender3Column + ")");
        System.out.println("(" + defender4Row + "," + defender4Column + ")");
        Toolkit.getDefaultToolkit().beep();
    }
}