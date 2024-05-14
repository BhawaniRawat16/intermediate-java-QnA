// Exception HAndling (Error Handling)
// Errors
//               Compile Time Error
//               Run Time Error

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int n, d, r;
        Scanner ob = new Scanner(System.in);
        try {
            System.out.println("Enter Nominetor : ");
            n = ob.nextInt();
            System.out.println("Enter Denominator : ");
            d = ob.nextInt();
            r = n / d;
            System.out.println("Result : " + r);
        } catch (ArithmeticException e) {
            System.out.println("Invalid Denominator ");
        }

        System.out.println("Good Day .........");
    }
}
