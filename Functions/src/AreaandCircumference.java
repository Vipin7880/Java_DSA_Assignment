import java.util.Scanner;

public class AreaandCircumference {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        float r=sc.nextFloat();

        System.out.printf("Area: %.2f", Area(r));
        System.out.println();
        System.out.printf("Circumference: %.2f", Circumference(r));
    }
    static float Area(float radius){
        return (float) (Math.PI*radius*radius);
    }
    static float Circumference(float radius){
        return (float) (2*radius*Math.PI);
    }
}
