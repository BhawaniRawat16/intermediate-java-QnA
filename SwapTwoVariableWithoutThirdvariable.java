import java.util.Scanner;

public class SwapTwoVariableWithoutThirdvariable {
    public static void main(String[] args) {
        int a, b, tmp;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Tow Numbers : ");
        a = ob.nextInt();
        b = ob.nextInt();

        tmp = a + b; //
        a = tmp - a;
        b = tmp - b;

        System.out.println("A Is : " + a);
        System.out.println("B Is : " + b);

    }
}
