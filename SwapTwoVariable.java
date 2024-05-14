import java.util.Scanner;

public class SwapTwoVariable {
    public static void main(String[] args) {
        int a, b;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        a = ob.nextInt();
        System.out.print("Enter First Number : ");
        b = ob.nextInt();

        System.out.println("Before A Is : " + a);
        System.out.println("Before B Is : " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After A Is : " + a);
        System.out.println("After B Is : " + b);

    }
}
