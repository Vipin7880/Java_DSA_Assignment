import java.util.Scanner;

public class AreaofIsoscelesTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The length of one of the two equal sides: ");
        float a=sc.nextFloat();
        System.out.print("Enter The length of the base: ");
        float b=sc.nextFloat();

        double A=(b*Math.sqrt((4*a*a)-(b*b)))/4;
        System.out.println("Area of Given Triangle is: "+ String.format("%.2f", A));
    }
}