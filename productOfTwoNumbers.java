import java.util.*;

public class productOfTwoNumbers {
    public static void main(String[] args) {
        int a, b, pro;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        a = obj.nextInt();
        System.out.print("Enter A Number : ");
        b = obj.nextInt();

        pro = a * b;
        System.out.print("The Product Of Two Numbers : " + pro);
    }
}
