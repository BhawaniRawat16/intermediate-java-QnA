// Exception HAndling (Error Handling)

import java.util.Scanner;

public class ExceptionHandling3 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int inx, r;
        Scanner ob = new Scanner(System.in);
        try {
            System.out.println("Enter Index : ");
            inx = ob.nextInt();
            r = 10 / (5 - a[inx]);
            System.out.println("Result Is : " + r);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index Number !");
        } catch (ArithmeticException e) {
            System.out.println("Invalid Denominator");
        }

        System.out.println("Good Day .........");
    }
}