import java.util.Scanner;

public class Paralelolgramparameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base :");
        float base=sc.nextFloat();
        System.out.print("Enter height :");
        float height= sc.nextFloat();

        float P=2*(base+height);

        System.out.println("Parameter is: "+ String.format("%.2f", P));

    }
}
