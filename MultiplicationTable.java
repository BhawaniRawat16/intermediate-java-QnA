import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num, res;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        num = ob.nextInt();

        for (int i = 1; i <= 10; i++) {
            res = i * num;
            System.out.println(num + " x " + i + " = " + res);

        }
    }
}
