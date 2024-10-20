import java.util.Scanner;

public class Pythagoreantriplet {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc =new Scanner(System.in);
        for (int i=0; i<5; i++){
            System.out.print("Enter Elements no "+i+" to check pythagorean triplet:");
            arr[i]=sc.nextInt();
        }
        System.out.println(Pythagorean(arr));

    }
    static boolean Pythagorean(int[] arr){
        int n=arr.length;

        for (int i=0; i<n; i++){
            for (int j=+1; j<n; j++){
                for (int k=j+1; k<n; k++){
                    int x=arr[i]*arr[i];
                    int y=arr[j]*arr[j];
                    int z=arr[k]*arr[k];

                    if (x==y+z|| y==x+z||z==x+y)
                        return true;
                }
            }
        }
        return false;
    }
}
