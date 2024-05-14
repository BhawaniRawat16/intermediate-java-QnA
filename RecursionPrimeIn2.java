import java.util.Scanner;

public class RecursionPrimeIn2 {
    public static void main(String[] args) {
        int num1, num2, count = 0;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        num1 = obj.nextInt();
        System.out.print("Enter Second Number : ");
        num2 = obj.nextInt();

        for (int i = num1; i <= num2; i++) {
            for (int j = num1; j <= i; j++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }

    }
}
