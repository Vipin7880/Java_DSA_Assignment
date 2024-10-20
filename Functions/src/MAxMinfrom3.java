import java.util.Scanner;

public class MAxMinfrom3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter all three number with space: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();

        System.out.println("Max among three is "+ Max(n1,n2,n3));
        System.out.println("Min among three is "+ Min(n1,n2,n3));
    }
    static int Max(int a, int b, int c){
        int max=a;
        if (b>a)
            max=b;
        if (c>max)
            max=c;

        return max;
    }
    static int Min(int a, int b, int c){
        int min=a;
        if (b<min)
            min=b;
        if (c<min)
            min=c;
        return min;
    }
}