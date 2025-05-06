import java.util.Scanner;
public class Challenge8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the base of the triangle?");
        int triangleBase = input.nextInt();
        System.out.println("And what is the height of the triangle?");
        int triangleHeight = input.nextInt();
        int triangleArea = triangleHeight * triangleBase / 2;
        System.out.println("The area of the triangle is " + triangleArea);
    }
}
