import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check either it is prime or not: ");
        int num = sc.nextInt();
        System.out.println(Isprime(num));
    }

    static boolean Isprime(int num){
        boolean IsPrime=true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                IsPrime = false;
                break;
            }
        }
            return IsPrime;
    }

}
