import java.util.Scanner;

public class perimeterofSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of on Side:");
        float s=sc.nextFloat();

        float P=4*s;

        System.out.println("Perimeter is : "+ String.format("%.2f", P));
    }
}
