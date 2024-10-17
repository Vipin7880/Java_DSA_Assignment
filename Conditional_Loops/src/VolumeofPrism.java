import java.util.Scanner;

public class VolumeofPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose your Prism type -\n 1:Rectangular Prism:\n 2:Triangular Prism:");
        int ch=sc.nextInt();

        float Volume = 0.00F;

        if (ch==1){
            System.out.print("Enter Length: ");
            float l=sc.nextFloat();
            System.out.print("Enter Width: ");
            float w=sc.nextFloat();
            System.out.print("Enter height: ");
            float h=sc.nextFloat();

            Volume=l*w*h;
        } else if (ch == 2) {
            System.out.print("Enter Base:");
            float b=sc.nextFloat();
            System.out.print("Enter height of triangle:");
            float h=sc.nextFloat();
            System.out.print("Enter height/length of Prism:");
            float l=sc.nextFloat();

            Volume=(l*b*h)/2;
        }
        System.out.println("Volume of prism is : "+ String.format("%.2f", Volume));
    }
}
