package Intermediate;

public class KunalOuting {
    public static void main(String[] args) {
        int n=31; //days of august month

        int count=0;
        for (int i=1; i<=n; i++){
            if (i%2==0)
                count++;
        }
        System.out.println(count+" Days Kunal is allowed to go out with his friends");
    }

}
