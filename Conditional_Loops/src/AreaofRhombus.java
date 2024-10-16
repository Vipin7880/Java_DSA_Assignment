import java.util.Scanner;

public class AreaofRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Choice to Get Area \n 1:Using Base and Height\n " +
                "2:Using the lengths of the diagonals:\n Enter:");
        int ch=sc.nextInt();

        if (ch==1){
            System.out.print("Enter Base :");
            double base=sc.nextDouble();
            System.out.print("Enter Height :");
            double height=sc.nextDouble();

            double A=base*height;
            System.out.println("Area: "+ String.format("%.2f", A));
        }
        else {
            System.out.print("Enter D1 :");
            double d1=sc.nextDouble();
            System.out.print("Enter D2 :");
            double d2=sc.nextDouble();

            double A=d1*d2;
            System.out.println("Area: "+ String.format("%.2f", A));

        }
    }
}