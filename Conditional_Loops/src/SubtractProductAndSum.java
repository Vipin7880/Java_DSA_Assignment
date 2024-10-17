class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1, sum=0, r;
        while (n > 0) {
            r = n % 10;
            product*=r;
            sum+=r;
            n = n / 10;
        }

        return product - sum;
    }

}

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 234;
        System.out.println(obj.subtractProductAndSum(n));
        int n2 = 4421;
        System.out.print(obj.subtractProductAndSum(n2));
    }
}