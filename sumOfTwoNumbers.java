import java.util.*;

public class sumOfTwoNumbers {
    public static void main(String[] args) {
        int a, b, sum;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        a = obj.nextInt();
        System.out.print("Enter 2nd Number : ");
        b = obj.nextInt();

        sum = a + b;
        System.out.println("The Sum Of Two Numbers Is : " + sum);
    }
}
