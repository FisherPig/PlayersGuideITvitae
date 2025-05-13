import java.util.Scanner;
import java.util.Arrays;

public class Challenge18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input 5 numbers.");
        int[] dto = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), };
        int[] clone = {0, 1, 2, 3, 4};
        for (int i : clone) {
            clone[i] = dto[i];
        }
        System.out.println(Arrays.toString(dto));
        System.out.println(Arrays.toString(clone));
    }
}
