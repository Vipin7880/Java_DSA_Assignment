import java.util.Scanner;

public class VolumeofCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius of Cylinder:");
        float r=sc.nextFloat();

        System.out.print("Enter height of Cylinder:");
        float h=sc.nextFloat();

        float volume= 3.14159F*r*r*h;

        System.out.println("Volume is: "+ String.format("%.2f", volume));
    }
}
