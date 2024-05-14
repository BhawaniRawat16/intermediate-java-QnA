import java.util.*;

public class divideTwoNumbers {
    public static void main(String[] args) {
        int a, b, res;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        a = obj.nextInt();
        System.out.print("Enter A Number : ");
        b = obj.nextInt();
        res = a / b;
        System.out.println("The Dividation Of Two Numbers : " + res);
    }
}
