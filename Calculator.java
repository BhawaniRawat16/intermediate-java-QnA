import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        int a, b, sum, sub, mul, div, mod;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        a = obj.nextInt();
        System.out.print("Enter A Number : ");
        b = obj.nextInt();
        sum = a + b;
        sub = a - b;
        mul = a * b;
        div = a / b;
        mod = a % b;
        System.out.println("The Sum Of Two Numbers Is : " + sum);
        System.out.println("The Subtraction Of Two Numbers Is : " + sub);
        System.out.println("The Multiplication Of Two Numbers Is : " + mul);
        System.out.println("The Dividation Of Two Numbers Is : " + div);
        System.out.println("The Modulas Of Two Numbers Is : " + mod);
    }
}
