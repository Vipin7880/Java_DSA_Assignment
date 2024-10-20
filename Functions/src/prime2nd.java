import java.util.Scanner;

public class prime2nd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Starting term: ");
        int start= sc.nextInt();
        System.out.print("Enter ending term: ");
        int end = sc.nextInt();

        for (int i= start; i<= end; i++){
            if (Isprime(i))
                System.out.print(i + " ");
        }
    }
    static boolean Isprime(int num){
        boolean IsPrime=true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
       return IsPrime;
    }
}
