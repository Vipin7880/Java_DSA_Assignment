import java.util.Scanner;

public class VoteCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age=sc.nextInt();

        CanVote(age);
    }
    static void CanVote(int n){
        if (n>=18)
            System.out.println("Eligible");
        else
            System.out.println("InEligible");
    }
}
