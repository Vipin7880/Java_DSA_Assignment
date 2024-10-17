import java.util.Scanner;

public class EQtriangleParameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of one side: ");
        float s=sc.nextFloat();

        float p=3*s;

        System.out.println("Parameter is: "+ String.format("%.2f", p));
    }
}
