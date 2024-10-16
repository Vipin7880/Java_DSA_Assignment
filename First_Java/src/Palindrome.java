import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
       name= name.toLowerCase();
        boolean ans = Ispalindrome(name);
        System.out.println(ans);
    }

    public static boolean Ispalindrome(String str) {
        boolean ans = false;
        String revstr="";
        for (int i = str.length()-1; i >= 0; i--) {
            revstr=revstr+str.charAt(i);
        }

        if (revstr.equals(str))
            ans = true;
        return ans;
    }
}

