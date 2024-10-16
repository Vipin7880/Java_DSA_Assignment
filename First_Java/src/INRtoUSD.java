import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount in INR:");
        int INR= sc.nextInt();

        double USD=(INR*0.012);

        System.out.println(INR+" INR is Equal to "+ USD+ " USD");
    }
}
