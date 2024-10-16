import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Breadth of Triangle:");
        int b= sc.nextInt();
        System.out.println("Enter Height of Triangle:");
        int h= sc.nextInt();

        double A=  (double) (b * h) /2;
        System.out.println("Area of Given Triangle is: "+ String.format("%.2f", A));

    }
}