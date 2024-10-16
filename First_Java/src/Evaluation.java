import java.util.Scanner;

public class Evaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number: ");
        int num1= Integer.parseInt(sc.nextLine());

        System.out.println("Enter Second Number:");
        int num2= Integer.parseInt(sc.nextLine());

        System.out.println("Enter Operator ( +, -, *, /) :");
        char opr= sc.next().trim().charAt(0);

        if(opr == '+') {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }
        else if (opr == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        }
        else if (opr == '*') {
            System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        }
        else if (opr=='/') {
            if (num2<=0)
                System.out.println("Division Not Possible");
            else {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }
        }
    }
}
