import java.util.Scanner;

public class LargestEntered {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int max=0;

        while (true){
            System.out.print("Enter num:");
            int n=sc.nextInt();

            if (n==0)
                break;
            else if (n>max)
                max=n;
        }
        System.out.println("Max Value:"+max);
    }
}
