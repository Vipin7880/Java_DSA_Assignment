import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check");
        int num=sc.nextInt();

        System.out.print(palindrome(num));
    }
    static boolean palindrome(int num){
        int temp=num;
        int newNum=0;
        while (num>0){
            int r=num%10;
            newNum=newNum*10+r;
            num/=10;
        }
        if (newNum==temp)
            return true;
        else
            return false;
    }
}
