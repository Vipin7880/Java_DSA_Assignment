import java.util.Scanner;

public class TSACube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of one side of the cube: ");
        float s= sc.nextFloat();

        float TSA=6*s*s;

        System.out.println("TSA is :"+ String.format("%.2f", TSA));
    }
}
