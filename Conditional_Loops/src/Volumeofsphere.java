import java.util.Scanner;

public class Volumeofsphere {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Radius of Sphere:");
        float r=sc.nextFloat();

        double volume= 4*(3.14159F*Math.pow(r,3))/3;

        System.out.println("Volume is: "+ String.format("%.2f", volume));
    }
}
