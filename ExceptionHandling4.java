import java.util.Scanner;

public class ExceptionHandling4 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int idx, r;
        Scanner ob = new Scanner(System.in);
        try {
            System.out.println("Enter Index....");
            idx = ob.nextInt();
            r = 10 / (5 - a[idx]);
            System.out.println("Result  " + r);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Final Block...");
        }

        System.out.println("Good Day.........");
    }
}
