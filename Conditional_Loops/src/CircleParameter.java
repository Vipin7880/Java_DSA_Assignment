import java.util.Scanner;

public class CircleParameter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    float pi=3.14159F;
        System.out.print("Enter radius of circle:");
        float r=sc.nextFloat();

        float P=2*pi*r;

        System.out.println("Parameter of Given Circle is: "+ String.format("%.2f", P));
    }
}
