// Exception HAndling (Error Handling)
// Errors
//               Compile Time Error
//               Run Time Error

import java.util.Scanner;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int inx;
        Scanner ob = new Scanner(System.in);
        try {
            System.out.println("Enter Index : ");
            inx = ob.nextInt();
            System.out.println("Value Is : " + a[inx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index Number !");
        }

        System.out.println("Good Day .........");
    }
}